package com.itrex.mvc.controller;

import com.itrex.mvc.dto.Simple;
import com.itrex.mvc.dto.User;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @GetMapping(value = "/greeting")
    public String getGreetingPage(Model model) {
        model.addAttribute("user", new User("Ivan", "Ivanov"));
        return "greeting";
    }
}
