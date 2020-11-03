package com.tich_hop_ajax_ung_dung_blog.service.impl;

import com.tich_hop_ajax_ung_dung_blog.entity.Blog;
import com.tich_hop_ajax_ung_dung_blog.repository.BlogRepository;
import com.tich_hop_ajax_ung_dung_blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    private BlogRepository blogRepository;

    @Override
    public List<Blog> searchBlogName(String name) {
        return this.blogRepository.searchBlogName(name);
    }

    @Override
    public List<Blog> findAll() {
        return blogRepository.findAll();
    }

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
