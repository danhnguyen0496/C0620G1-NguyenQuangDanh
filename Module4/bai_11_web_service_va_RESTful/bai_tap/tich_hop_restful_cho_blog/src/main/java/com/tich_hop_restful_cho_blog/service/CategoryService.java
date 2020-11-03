package com.tich_hop_restful_cho_blog.service;

import com.tich_hop_restful_cho_blog.entity.Category;

import java.util.List;

public interface CategoryService {
    List<Category> findAll();
    void save(Category category);
    Category findById(Integer id);
    void remove(Integer id);
}
