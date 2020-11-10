package com.project_furama.service.login_service;

import com.project_furama.entity.login.AppUser;


public interface UserRoleService {

    void saveUserRole(AppUser appUser, Long roleId);
}
