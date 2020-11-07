package com.phan_quyen_ung_dung_blog.service.impl;

import com.phan_quyen_ung_dung_blog.entity.AppUser;
import com.phan_quyen_ung_dung_blog.entity.UserRole;
import com.phan_quyen_ung_dung_blog.repository.AppRoleRepository;
import com.phan_quyen_ung_dung_blog.repository.UserRoleRepository;
import com.phan_quyen_ung_dung_blog.service.UserRoleService;
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
