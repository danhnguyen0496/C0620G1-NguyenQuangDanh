package com.upgrade_blog.service.impl;

import com.upgrade_blog.entity.Blog;
import com.upgrade_blog.repository.BlogRepository;
import com.upgrade_blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;



@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    private BlogRepository blogRepository;

    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return blogRepository.findAll(pageable);
    }

    @Override
    public Blog findById(Integer id) {
        return blogRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Blog blog) {
        this.blogRepository.save(blog);
    }

    @Override
    public void remove(Integer id) {
        this.blogRepository.deleteById(id);
    }

    @Override
    public Page<Blog> findByNameContaining(Pageable pageable, String name) {
        return this.blogRepository.findAllByNameContaining(pageable, name);
    }
}
