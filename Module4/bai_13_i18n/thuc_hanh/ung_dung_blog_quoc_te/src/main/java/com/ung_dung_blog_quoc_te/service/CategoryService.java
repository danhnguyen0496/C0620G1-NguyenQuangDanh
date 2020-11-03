package com.ung_dung_blog_quoc_te.service;

import com.ung_dung_blog_quoc_te.entity.Category;

import java.util.List;

public interface CategoryService {
    List<Category> findAll();
    void save(Category category);
    Category findById(Integer id);
    void remove(Integer id);
}
