package com.quan_ly_danh_sach_khach_hang.controller;

import com.quan_ly_danh_sach_khach_hang.entity.Customer;
import com.quan_ly_danh_sach_khach_hang.service.CustomerService;
import com.quan_ly_danh_sach_khach_hang.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private ProvinceService provinceService;

    @GetMapping("/")
    public String index(Model model, RedirectAttributes redirectAttributes, @PageableDefault(size = 2) Pageable pageable,
                        @RequestParam Optional<String> keyword) {
        String keywordOld = "";

        if (keyword.isPresent()) {
            keywordOld = keyword.get();
            model.addAttribute("listCustomer", this.customerService.findByNameContaining(pageable, keywordOld));
        } else {
            model.addAttribute("listCustomer", this.customerService.findAll(pageable));
        }
        model.addAttribute("keywordOld", keywordOld);
        redirectAttributes.addFlashAttribute("message", "");
        return "list_customer";
    }

    @GetMapping("/create-customer")
    public String createFormCustomer(Model model, RedirectAttributes redirectAttributes) {
        model.addAttribute("customer", new Customer());
        model.addAttribute("listCustomer", this.provinceService.findAll());
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
        try {
            model.addAttribute("customer", customerService.findById(id));
            model.addAttribute("listCustomer", this.provinceService.findAll());
            redirectAttributes.addFlashAttribute("message", "");
            return "edit";
        } catch (Exception e) {
            return "error_customer";
        }
    }

    @PostMapping("/edit-customer")
    public String editCustomer(Customer customer, RedirectAttributes redirectAttributes) {
        customerService.save(customer);
        redirectAttributes.addFlashAttribute("message", "Edit successful");
        return "redirect:/";
    }

    @GetMapping("/delete-customer/{id}")
    public String deleteForm(Model model, RedirectAttributes redirectAttributes, @PathVariable Long id) {
        try {
            model.addAttribute("customer", customerService.findById(id));
            redirectAttributes.addFlashAttribute("message", "");
            return "delete";
        } catch (Exception e) {
            return "error_customer";
        }
    }

    @PostMapping("/delete-customer")
    public String deleteCustomer(Customer customer, RedirectAttributes redirectAttributes) {
        customerService.remove(customer.getId());
        redirectAttributes.addFlashAttribute("message", "Delete successful!");
        return "redirect:/";
    }

    @ExceptionHandler(value = Exception.class)
    public String handleException() {
        return "error_customer";
    }
}
