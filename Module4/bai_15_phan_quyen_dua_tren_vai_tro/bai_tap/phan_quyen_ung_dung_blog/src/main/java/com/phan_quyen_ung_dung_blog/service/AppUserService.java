package com.phan_quyen_ung_dung_blog.service;

import com.phan_quyen_ung_dung_blog.entity.AppUser;

import java.util.List;

public interface AppUserService {
    List<AppUser> findAll();

    void save(AppUser appUser);

}
