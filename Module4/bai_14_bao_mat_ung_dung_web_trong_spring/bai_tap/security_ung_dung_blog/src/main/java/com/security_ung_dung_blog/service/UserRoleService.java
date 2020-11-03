package com.security_ung_dung_blog.service;

import com.security_ung_dung_blog.entity.AppUser;


public interface UserRoleService {

    void saveUserRole(AppUser appUser, Long roleId);
}
