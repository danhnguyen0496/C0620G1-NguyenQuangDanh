package com.luu_ten_nguoi_dung_su_dung_cookie.controller;

import com.luu_ten_nguoi_dung_su_dung_cookie.entity.User;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
@SessionAttributes("userLogin")
public class LoginController {


    @GetMapping("/")
    public String goViewFormLogin(Model model,
                                  @CookieValue(value = "emailC", defaultValue = "") String email,
                                  @CookieValue(value = "passwordC", defaultValue = "") String password) {
        model.addAttribute("userLogin", new User(email, password));
        return "login";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute(value = "userLogin") User user, HttpServletResponse response, Model model) {

        if (user.getEmail().equals("admin@gmail.com") && user.getPassword().equals("123456")) {
            if (user.getEmail() != null) {
                Cookie cookieEmail = new Cookie("emailC", user.getEmail());
                Cookie cookiePassword = new Cookie("passwordC", user.getPassword());
                cookieEmail.setMaxAge(60 * 60 * 365);
                cookiePassword.setMaxAge(60 * 60 * 365);
                response.addCookie(cookieEmail);
                response.addCookie(cookiePassword);
            }
        } else {
            user.setEmail("");
            Cookie cookieEmail = new Cookie("emailC", user.getEmail());
            response.addCookie(cookieEmail);
            model.addAttribute("message", "Login failed. Try again");
        }
        return "home";
    }
}
