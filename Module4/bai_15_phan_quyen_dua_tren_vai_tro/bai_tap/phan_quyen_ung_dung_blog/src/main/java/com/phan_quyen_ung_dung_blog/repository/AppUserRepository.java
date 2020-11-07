package com.phan_quyen_ung_dung_blog.repository;

import com.phan_quyen_ung_dung_blog.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {
    AppUser findByUserName(String userName);
}
