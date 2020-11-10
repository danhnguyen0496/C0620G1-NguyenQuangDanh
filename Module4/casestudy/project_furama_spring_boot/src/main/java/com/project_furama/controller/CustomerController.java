package com.project_furama.controller;

import com.project_furama.entity.customer.Customer;
import com.project_furama.service.customer_service.CustomerService;
import com.project_furama.service.customer_service.CustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@SessionAttributes("userLogin")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private CustomerTypeService customerTypeService;

    @GetMapping("/home-customer")
    public String goHomeCustomer(Model model, @PageableDefault(size = 5) Pageable pageable,
                                 @RequestParam Optional<String> keyword) {
        String keywordOld = "";
        if (keyword.isPresent()) {
            keywordOld = keyword.get();
            model.addAttribute("listCustomer", this.customerService.findByAllCustomerNameContaining(pageable, keywordOld));
        } else {
            model.addAttribute("listCustomer", this.customerService.findAll(pageable));
        }
        model.addAttribute("keywordOld", keywordOld);
        return "customer/home_customer";
    }


    @GetMapping("/create-customer")
    public String createFormCustomer(Model model) {
        model.addAttribute("customer", new Customer());
        model.addAttribute("listCustomerType", this.customerTypeService.findAll());
        return "customer/create_customer";
    }

    @PostMapping("/save-customer")
    public String saveCustomer(@Validated @ModelAttribute Customer customer, BindingResult bindingResult) {
        new Customer().validate(customer, bindingResult);
        if (bindingResult.hasFieldErrors()) {
            return "customer/create_customer";
        } else {
            this.customerService.save(customer);
        }
        return "redirect:/home-customer";
    }

    @PostMapping("/delete-customer")
    public String deleteCustomer(@RequestParam String idDeleteCustomerHidden) {
        this.customerService.remove(idDeleteCustomerHidden);
        return "redirect:/home-customer";
    }

    @GetMapping("/update-customer/{id}")
    public String formUpdateCustomer(@PathVariable String id, Model model) {
        model.addAttribute("customer", this.customerService.findById(id));
        model.addAttribute("listCustomerType", this.customerTypeService.findAll());
        return "customer/update_customer";
    }

    @PostMapping("/save-update-customer")
    public String updateCustomer(@ModelAttribute Customer customer) {
        this.customerService.save(customer);
        return "redirect:/home-customer";
    }

}
