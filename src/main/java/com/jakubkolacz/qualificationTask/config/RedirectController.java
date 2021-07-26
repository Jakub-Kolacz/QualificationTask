package com.jakubkolacz.qualificationTask.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RedirectController {
    @GetMapping
    public String redirect() {
        return "redirect:/swagger-ui/index.html";
    }
}
