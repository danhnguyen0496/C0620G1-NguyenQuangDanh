package com.quan_ly_khach_hang.controller;

import com.quan_ly_khach_hang.entity.Customer;
import com.quan_ly_khach_hang.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/")
    public String index(Model model, RedirectAttributes redirectAttributes) {
        List<Customer> customerList = customerService.findAll();
        model.addAttribute("customers", customerList);
        redirectAttributes.addFlashAttribute("message", "");
        return "list_customer";
    }

    @GetMapping("/create-customer")
    public String createFormCustomer(Model model, RedirectAttributes redirectAttributes) {
        model.addAttribute("customer", new Customer());
        redirectAttributes.addFlashAttribute("message", "");
        return "create";
    }

    @PostMapping("/create-customer")
    public String createCustomer(Customer customer, RedirectAttributes redirectAttributes) {
        customerService.save(customer);
        redirectAttributes.addFlashAttribute("message", "Customer create successfully!");
        return "redirect:/";
    }

    @GetMapping("/edit-customer/{id}")
    public String editFormCustomer(Model model, RedirectAttributes redirectAttributes, @PathVariable Long id) {
        model.addAttribute("customer", customerService.findById(id));
        redirectAttributes.addFlashAttribute("message", "");
        return "edit";
    }

    @PostMapping("/edit-customer")
    public String editCustomer(Customer customer, RedirectAttributes redirectAttributes) {
        customerService.save(customer);
        redirectAttributes.addFlashAttribute("message", "Edit successful");
        return "redirect:/";
    }

    @GetMapping("/delete-customer/{id}")
    public String deleteForm(Model model, RedirectAttributes redirectAttributes, @PathVariable Long id) {
        model.addAttribute("customer", customerService.findById(id));
        redirectAttributes.addFlashAttribute("message", "");
        return "delete";
    }

    @PostMapping("/delete-customer")
    public String deleteCustomer(Customer customer, RedirectAttributes redirectAttributes) {
        customerService.remove(customer.getId());
        redirectAttributes.addFlashAttribute("message", "Delete successful!");
        return "redirect:/";
    }
}
