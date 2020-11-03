package com.security_ung_dung_blog.controller;

import com.security_ung_dung_blog.entity.AppRole;
import com.security_ung_dung_blog.entity.AppUser;
import com.security_ung_dung_blog.entity.UserRole;
import com.security_ung_dung_blog.service.AppUserService;
import com.security_ung_dung_blog.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes(value = "userLogin")
public class LoginController {

    @Autowired
    private UserRoleService userRoleService;

    @Autowired
    private AppUserService appUserService;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @GetMapping(value = "/login")
    public String goLogin() {
        return "register/login";
    }

    @GetMapping("/register-blog")
    public String goFormRegister(Model model) {
        model.addAttribute("appUser", new AppUser());
        return "register/register_user";
    }

    @PostMapping("/register-user")
    public String saveRegister(@ModelAttribute AppUser appUser, @RequestParam("role") Long[] role) {
        appUser.setEncrytedPassword(bCryptPasswordEncoder.encode(appUser.getEncrytedPassword()));
        this.appUserService.save(appUser);
        for (Long roleId : role) {
            this.userRoleService.saveUserRole(appUser, roleId);
        }
        return "redirect:/home-blog";
    }

}
