package com.validate_form_register.controller;

import com.validate_form_register.entity.User;
import com.validate_form_register.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String viewFormRegisterUser(Model model) {
        model.addAttribute("user", new User());
        return "register_user";
    }

    @PostMapping("/register-user")
    public String registerUser(@Validated @ModelAttribute User user, BindingResult bindingResult, Model model) {

        new User().validate(user, bindingResult);

        if (bindingResult.hasFieldErrors()) {
            return "register_user";
        } else {
            model.addAttribute("user", this.userService.save(user));
        }
        return "result_register";
    }
}
