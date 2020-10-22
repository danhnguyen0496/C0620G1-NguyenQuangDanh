package com.upgrade_blog.service;

import com.upgrade_blog.entity.Blog;
import com.upgrade_blog.entity.Category;

import java.util.List;

public interface CategoryService {
    List<Category> findAll ();
    void save(Category category);
    Category findById (Integer id);
    void remove(Integer id);
}
