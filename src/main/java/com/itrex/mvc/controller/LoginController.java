package com.itrex.mvc.controller;

import com.itrex.mvc.dto.Gender;
import com.itrex.mvc.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("currentUser")
public class LoginController {

    @ModelAttribute
    public void setGender(Model model) {
        model.addAttribute("gender", Gender.FEMALE);
    }

    @ExceptionHandler(Exception.class)
    public String handle(Model model, Exception e) {
        model.addAttribute("errorMessage", e.getMessage());
        return "error";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String login(Model model, User user) {
        if ("Test".equals(user.getUsername())) {
            throw new RuntimeException("Login failed");
        }
        model.addAttribute("currentUser", user);
        return "redirect:greeting";
    }

}
