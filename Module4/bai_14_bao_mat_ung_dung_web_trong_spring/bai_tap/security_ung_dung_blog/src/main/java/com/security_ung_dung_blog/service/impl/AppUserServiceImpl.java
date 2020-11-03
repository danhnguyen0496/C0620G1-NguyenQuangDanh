package com.security_ung_dung_blog.service.impl;

import com.security_ung_dung_blog.entity.AppUser;
import com.security_ung_dung_blog.repository.AppUserRepository;
import com.security_ung_dung_blog.service.AppUserService;
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
