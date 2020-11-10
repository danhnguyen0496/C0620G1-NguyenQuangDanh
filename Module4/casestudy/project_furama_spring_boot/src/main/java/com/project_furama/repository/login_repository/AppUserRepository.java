package com.project_furama.repository.login_repository;

import com.project_furama.entity.login.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {
    AppUser findByUserName(String userName);
}
