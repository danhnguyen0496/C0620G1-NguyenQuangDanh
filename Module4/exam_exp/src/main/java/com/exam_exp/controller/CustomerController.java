package com.exam_exp.controller;

import com.exam_exp.entity.Customer;
import com.exam_exp.service.CustomerService;
import com.exam_exp.service.TypeCustomerService;
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
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private TypeCustomerService typeCustomerService;

    @GetMapping({"/", "/home"})
    public String goHomePage() {
        return "home_page";
    }

    @GetMapping("/home-customer")
    public String displayListCustomer(Model model, @PageableDefault(size = 4) Pageable pageable,
                                      @RequestParam Optional<String> keyword) {
        String keywordOld = "";
      if (keyword.isPresent()) {
            keywordOld = keyword.get();
            model.addAttribute("listCustomer", this.customerService.findAllByCustomerNameContaining(pageable, keywordOld));
        } else {
            model.addAttribute("listCustomer", this.customerService.findAll(pageable));
        }
        model.addAttribute("keywordOld", keywordOld);
        return "home_customer";
      }

    @PostMapping("/delete-customer")
    public String deleteCustomer(@RequestParam String idDeleteCustomerHidden) {
        this.customerService.remove(idDeleteCustomerHidden);
        return "redirect:/home-customer";
    }

    @GetMapping("/create-customer")
    public String formCreateCustomer(Model model) {
        model.addAttribute("customer", new Customer());
        model.addAttribute("listTypeCustomer", this.typeCustomerService.findAll());
        return "create_customer";
    }

    @PostMapping("/create-customer")
    public String createCustomer(@Validated @ModelAttribute Customer customer, BindingResult bindingResult, Model model) {
        new Customer().validate(customer, bindingResult);
        if (bindingResult.hasFieldErrors()) {
            model.addAttribute("customer", customer);
            model.addAttribute("listTypeCustomer", this.typeCustomerService.findAll());
            return "create_customer";
        } else {
            this.customerService.save(customer);
        }
        return "redirect:/home-customer";
    }

    @GetMapping("/update-customer/{id}")
    public String formUpdateCustomer(@PathVariable String id, Model model) {
        model.addAttribute("customer", this.customerService.findById(id));
        model.addAttribute("listTypeCustomer", this.typeCustomerService.findAll());
        return "update_customer";

    }

    @PostMapping("update-customer")
    public String updateCustomer(@Validated @ModelAttribute Customer customer, BindingResult bindingResult, Model model) {
        new Customer().validate(customer, bindingResult);
        if (bindingResult.hasFieldErrors()) {
            model.addAttribute("customer", customer);
            model.addAttribute("listTypeCustomer", this.typeCustomerService.findAll());
            return "update_customer";
        } else {
            this.customerService.save(customer);
        }
        return "redirect:/home-customer";
    }
}
