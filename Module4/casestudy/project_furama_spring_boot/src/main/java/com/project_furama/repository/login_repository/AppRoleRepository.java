package com.project_furama.repository.login_repository;


import com.project_furama.entity.login.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRoleRepository extends JpaRepository<AppRole, Long> {
}
