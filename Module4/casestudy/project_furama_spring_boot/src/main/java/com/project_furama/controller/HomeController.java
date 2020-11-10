package com.project_furama.controller;

import com.project_furama.entity.login.AppUser;
import com.project_furama.service.employee_service.EmployeeService;
import com.project_furama.service.login_service.AppUserService;
import com.project_furama.service.login_service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class HomeController {

    @Autowired
    private EmployeeService employeeService;

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

    @GetMapping("/form-register-account")
    public String goFormRegister(Model model) {
        model.addAttribute("appUser", new AppUser());
        model.addAttribute("listEmployee", this.employeeService.findAll());
        return "register/register_user";
    }

    @PostMapping("/register-account")
    public String saveRegister(@ModelAttribute AppUser appUser, @RequestParam("role") Long[] role) {
        appUser.setEncrytedPassword(bCryptPasswordEncoder.encode(appUser.getEncrytedPassword()));
        this.appUserService.save(appUser);
        for (Long aLong : role) {
            this.userRoleService.saveUserRole(appUser, aLong);
        }
        return "redirect:/login";
    }

    @GetMapping("/home")
    public String goHomePage() {
        return "home_page";
    }


}
