package com.tao_blog.controller;

import com.tao_blog.entity.Blog;
import com.tao_blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.persistence.criteria.CriteriaBuilder;

@Controller
public class BlogController {

    @Autowired
    private BlogService blogService;

    @GetMapping("/")
    public String goHomeBlog(Model model){
        model.addAttribute("listBlog", blogService.findAll());
        return "home_blog";
    }

    @GetMapping("/create")
    public String createFormBlog(Model model){
        model.addAttribute("blog", new Blog());
        return "create";
    }

    @PostMapping("/create")
    public String createBlog(Blog blog){
        this.blogService.save(blog);
        return "redirect:/";
    }

    @GetMapping("/blog/update/{id}")
    public String updateFormBlog(Model model, @PathVariable Integer id){
        model.addAttribute("blog", blogService.findById(id));
        return "update";
    }

    @PostMapping("/blog/update")
    public String updateBlog(Blog blog){
        blogService.save(blog);
        return "redirect:/";
    }

    @GetMapping("/blog/delete/{id}")
    public String deleteFormBlog(Model model, @PathVariable Integer id){
        model.addAttribute("blog",blogService.findById(id));
        return "delete";
    }

    @PostMapping("/blog/delete")
    public String deleteBlog(Blog blog){
        blogService.remove(blog.getId());
        return "redirect:/";
    }

    @GetMapping("/blog/view/{id}")
    public String viewBlog(Model model, @PathVariable Integer id){
        model.addAttribute("blog", blogService.findById(id));
        return "view";
    }
}
