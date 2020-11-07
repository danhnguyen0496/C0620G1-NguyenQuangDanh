package com.phan_quyen_ung_dung_blog.service;

import com.phan_quyen_ung_dung_blog.entity.Category;

import java.util.List;

public interface CategoryService {
    List<Category> findAll();
    void save(Category category);
    Category findById(Integer id);
    void remove(Integer id);
}
