package com.project_furama.service.login_service;

import com.project_furama.entity.login.AppUser;

import java.util.List;

public interface AppUserService {
    List<AppUser> findAll();

    void save(AppUser appUser);

}
