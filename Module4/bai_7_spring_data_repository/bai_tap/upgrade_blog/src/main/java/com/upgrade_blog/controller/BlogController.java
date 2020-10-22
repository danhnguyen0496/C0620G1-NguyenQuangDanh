package com.upgrade_blog.controller;

import com.upgrade_blog.entity.Blog;
import com.upgrade_blog.entity.Category;
import com.upgrade_blog.service.BlogService;
import com.upgrade_blog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;


@Controller
public class BlogController {

    @Autowired
    private BlogService blogService;

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/")
    public String goHomeBlog(Model model, @PageableDefault(size = 2) Pageable pageable, @RequestParam Optional<String> keyword) {

        String keywordOld = "";
        if (keyword.isPresent()) {
            keywordOld = keyword.get();
            model.addAttribute("listBlog", this.blogService.findByNameContaining(pageable, keywordOld));
        } else {
            model.addAttribute("listBlog", this.blogService.findAll(pageable));
        }
        model.addAttribute("keywordOld", keywordOld);
        return "blog/home_blog";
    }

    @GetMapping("/create")
    public String createFormBlog(Model model) {
        model.addAttribute("blog", new Blog());
        model.addAttribute("listCategory", this.categoryService.findAll());
        return "blog/create";
    }

    @PostMapping("/create")
    public String createBlog(Blog blog) {
        this.blogService.save(blog);
        return "redirect:/";
    }

    @GetMapping("/blog/update/{id}")
    public String updateFormBlog(Model model, @PathVariable Integer id) {
        model.addAttribute("blog", blogService.findById(id));
        model.addAttribute("listCategory", this.categoryService.findAll());
        return "blog/update";
    }

    @PostMapping("/blog/update")
    public String updateBlog(Blog blog) {
        blogService.save(blog);
        return "redirect:/";
    }

    @GetMapping("/blog/delete/{id}")
    public String deleteFormBlog(Model model, @PathVariable Integer id) {
        model.addAttribute("blog", blogService.findById(id));
        model.addAttribute("listCategory", this.categoryService.findAll());
        return "blog/delete";
    }

    @PostMapping("/blog/delete")
    public String deleteBlog(Blog blog) {
        blogService.remove(blog.getId());
        return "redirect:/";
    }

    @GetMapping("/blog/view/{id}")
    public String viewBlog(Model model, @PathVariable Integer id) {
        model.addAttribute("blog", blogService.findById(id));
        return "blog/view";
    }

}
