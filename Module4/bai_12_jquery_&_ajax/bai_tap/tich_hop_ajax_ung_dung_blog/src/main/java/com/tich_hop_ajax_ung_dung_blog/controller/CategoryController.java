package com.tich_hop_ajax_ung_dung_blog.controller;


import com.tich_hop_ajax_ung_dung_blog.entity.Category;
import com.tich_hop_ajax_ung_dung_blog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/view/category")
    public String goViewListCategory(Model model) {
        model.addAttribute("listCategory", this.categoryService.findAll());
        return "category/view_category";
    }

    @GetMapping("/create/category")
    public String goCreateFormCategory(Model model) {
        model.addAttribute("category", new Category());
        return "category/create_category";
    }

    @PostMapping("/create/category")
    public String createCategory(Category category) {
        this.categoryService.save(category);
        return "redirect:/view/category";
    }

    @GetMapping("/delete/category/{id}")
    public String deleteFormCategory(Model model, @PathVariable int id) {
        model.addAttribute("category", this.categoryService.findById(id));
        return "category/delete_category";
    }

    @PostMapping("/delete/category")
    public String deleteCategory(Category category) {
        this.categoryService.remove(category.getId());
        return "redirect:/view/category";
    }

    @GetMapping("/update/category/{id}")
    public String updateFormCategory(Model model, @PathVariable Integer id) {
        model.addAttribute("category", this.categoryService.findById(id));
        return "category/update_category";
    }

    @PostMapping("/update/category")
    public String updateCategory(Category category){
        this.categoryService.save(category);
        return "redirect:/view/category";
    }
}
