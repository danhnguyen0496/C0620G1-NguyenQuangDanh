package com.tich_hop_ajax_ung_dung_blog.controller;

import com.tich_hop_ajax_ung_dung_blog.entity.Blog;
import com.tich_hop_ajax_ung_dung_blog.entity.Category;
import com.tich_hop_ajax_ung_dung_blog.service.BlogService;
import com.tich_hop_ajax_ung_dung_blog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/blogRest")
@CrossOrigin("*")
public class BlogRestController {

    @Autowired
    private BlogService blogService;

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/viewAllListCategory")
    public ResponseEntity<List<Category>> getListCategory() {
        return new ResponseEntity<>(categoryService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/viewAllListBlog")
    public ResponseEntity<List<Blog>> getListBlog() {
        return new ResponseEntity<>(blogService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/viewCategory/{id}")
    public ResponseEntity<Category> getCategory(@PathVariable Integer id) {
        return new ResponseEntity<>(categoryService.findById(id), HttpStatus.OK);
    }

    @GetMapping("/viewBlog/{id}")
    public ResponseEntity<Blog> getBlog(@PathVariable Integer id) {
        return new ResponseEntity<>(blogService.findById(id), HttpStatus.OK);
    }

    @GetMapping("/viewAllListBlog/{name}")
    public ResponseEntity<List<Blog>> getNameBlog(@PathVariable String name) {
        if (name.equals("") || name == null) {
            return new ResponseEntity<>(blogService.findAll(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(blogService.searchBlogName(name), HttpStatus.OK);
        }
    }
}
