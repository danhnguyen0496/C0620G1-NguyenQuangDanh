package com.project_furama.service.login_service.impl;

import com.project_furama.entity.login.AppUser;
import com.project_furama.entity.login.UserRole;
import com.project_furama.repository.login_repository.AppRoleRepository;
import com.project_furama.repository.login_repository.UserRoleRepository;
import com.project_furama.service.login_service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserRoleServiceImpl implements UserRoleService {

    @Autowired
    private UserRoleRepository userRoleRepository;

    @Autowired
    private AppRoleRepository appRoleRepository;


    @Override
    public void saveUserRole(AppUser appUser, Long roleId) {
        UserRole userRole = new UserRole(appUser, this.appRoleRepository.findById(roleId).orElse(null));
        this.userRoleRepository.save(userRole);
    }
}
