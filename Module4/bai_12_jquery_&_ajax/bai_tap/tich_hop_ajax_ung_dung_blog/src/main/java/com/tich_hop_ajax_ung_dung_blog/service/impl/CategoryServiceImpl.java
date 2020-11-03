package com.tich_hop_ajax_ung_dung_blog.service.impl;

import com.tich_hop_ajax_ung_dung_blog.entity.Category;
import com.tich_hop_ajax_ung_dung_blog.repository.CategoryRepository;
import com.tich_hop_ajax_ung_dung_blog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> findAll() {
        return this.categoryRepository.findAll();
    }

    @Override
    public void save(Category category) {
        this.categoryRepository.save(category);
    }

    @Override
    public Category findById(Integer id) {
         return this.categoryRepository.findById(id).orElse(null);
    }

    @Override
    public void remove(Integer id) {
        this.categoryRepository.deleteById(id);
    }
}
