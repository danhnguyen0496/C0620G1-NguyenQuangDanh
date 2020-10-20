package com.tao_blog.service;

import com.tao_blog.entity.Blog;

import java.util.List;


public interface BlogService {

    List<Blog> findAll();

    Blog findById(Integer id);

    void save(Blog blog);

    void remove(Integer id);

}
