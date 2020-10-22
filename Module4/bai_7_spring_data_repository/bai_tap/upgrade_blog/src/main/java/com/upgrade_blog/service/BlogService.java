package com.upgrade_blog.service;

import com.upgrade_blog.entity.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface BlogService {

    Page<Blog> findAll(Pageable pageable);

    Blog findById(Integer id);

    void save(Blog blog);

    void remove(Integer id);

    Page<Blog> findByNameContaining(Pageable pageable, String name);

}
