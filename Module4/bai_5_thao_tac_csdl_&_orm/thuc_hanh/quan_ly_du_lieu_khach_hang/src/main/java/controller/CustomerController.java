package controller;

import entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import service.CustomerService;

import java.util.List;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/")
    public String index(Model model, RedirectAttributes redirect) {
        List<Customer> customerList = customerService.findAll();
        model.addAttribute("customers", customerList);
        redirect.addFlashAttribute("success", "");
        return "index";
    }

    @GetMapping("/customer/create")
    public String create(Model model) {
        model.addAttribute("customer", new Customer());
        return "create";
    }

    @PostMapping("/customer/saveAbc")
    public String saveAbc(RedirectAttributes redirect, Customer customer) {
        customerService.save(customer);
        redirect.addFlashAttribute("success", "Saved customer successfully!");
        return "redirect:/";
    }


    @GetMapping("/customer/{id}/edit")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("customer", customerService.findById(id));
        return "edit";
    }

    @PostMapping("/customer/update")
    public String update(Customer customer, RedirectAttributes redirect) {
        customerService.update(customer.getId(), customer);
        redirect.addFlashAttribute("success", "Modified customer successfully!");
        return "redirect:/";
    }

    @GetMapping("/customer/{id}/delete")
    public String delete(@PathVariable Integer id, Model model) {
        model.addAttribute("customer", customerService.findById(id));
        return "delete";
    }

    @PostMapping("/customer/delete")
    public String delete(@ModelAttribute Customer customer, RedirectAttributes redirect) {
        customerService.remove(customer);
        redirect.addFlashAttribute("success", "Removed customer successfully!");
        return "redirect:/";
    }

    @GetMapping("/customer/{id}/view")
    public String view(@PathVariable Integer id, Model model) {
        model.addAttribute("customer", customerService.findById(id));
        return "view";
    }
}
