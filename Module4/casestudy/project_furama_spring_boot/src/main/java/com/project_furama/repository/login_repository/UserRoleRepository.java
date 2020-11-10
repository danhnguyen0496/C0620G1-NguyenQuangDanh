package com.project_furama.repository.login_repository;

import com.project_furama.entity.login.AppUser;
import com.project_furama.entity.login.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRoleRepository extends JpaRepository<UserRole, Long> {
    List<UserRole> findByAppUser(AppUser appUser);

}
