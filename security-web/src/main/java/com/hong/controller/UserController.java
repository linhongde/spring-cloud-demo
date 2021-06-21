package com.hong.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/provider")
public class UserController {
    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @PreAuthorize("hasRole('ROLE_MENU')")
    @RequestMapping("/menu")
    public String menu() {
        return "ROLE_MENU";
    }

    @PreAuthorize("hasRole('ROLE_USER')")
    @RequestMapping("/user")
    public String user() {
        return "ROLE_USER";
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @RequestMapping("/admin")
    public String admin() {
        return "ROLE_ADMIN";
    }
}
