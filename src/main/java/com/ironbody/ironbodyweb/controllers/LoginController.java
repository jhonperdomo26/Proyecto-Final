package com.ironbody.ironbodyweb.controllers;

import org.springframework.web.bind.annotation.GetMapping;

public class LoginController {

    @GetMapping("/login")
    public String Login() {
        return "login";
    }
}
