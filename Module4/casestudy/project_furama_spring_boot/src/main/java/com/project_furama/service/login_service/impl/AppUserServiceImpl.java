package com.project_furama.service.login_service.impl;

import com.project_furama.entity.login.AppUser;
import com.project_furama.repository.login_repository.AppUserRepository;
import com.project_furama.service.login_service.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppUserServiceImpl implements AppUserService {

    @Autowired
    private AppUserRepository appUserRepository;

    @Override
    public List<AppUser> findAll() {
        return this.appUserRepository.findAll();
    }

    @Override
    public void save(AppUser appUser) {
        this.appUserRepository.save(appUser);
    }
}
