package com.security_ung_dung_blog.service;

import com.security_ung_dung_blog.entity.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface BlogService {

    List<Blog> searchBlogName(String name);

    List<Blog> findAll();

    Page<Blog> findAll(Pageable pageable);

    Blog findById(Integer id);

    void save(Blog blog);

    void remove(Integer id);

    Page<Blog> findByNameContaining(Pageable pageable, String name);

}
