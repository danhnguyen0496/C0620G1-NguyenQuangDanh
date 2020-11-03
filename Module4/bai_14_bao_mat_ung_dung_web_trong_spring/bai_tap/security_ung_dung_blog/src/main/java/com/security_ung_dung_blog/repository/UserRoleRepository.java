package com.security_ung_dung_blog.repository;

import com.security_ung_dung_blog.entity.AppUser;
import com.security_ung_dung_blog.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRoleRepository extends JpaRepository<UserRole, Long> {
    List<UserRole> findByAppUser(AppUser appUser);

}
