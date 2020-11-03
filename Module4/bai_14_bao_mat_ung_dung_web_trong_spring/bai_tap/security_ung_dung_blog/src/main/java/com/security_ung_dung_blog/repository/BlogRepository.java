package com.security_ung_dung_blog.repository;

import com.security_ung_dung_blog.entity.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BlogRepository extends JpaRepository<Blog, Integer> {

    Page<Blog> findAllByNameContaining(Pageable pageable, String name);

    @Query(value = "select *from blog where `name` like %?1%", nativeQuery = true)
    List<Blog> searchBlogName(String name);
}
