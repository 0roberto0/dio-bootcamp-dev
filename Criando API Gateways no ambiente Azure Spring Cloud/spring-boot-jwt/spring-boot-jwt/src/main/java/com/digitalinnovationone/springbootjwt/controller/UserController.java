package com.digitalinnovationone.springbootjwt.controller;

import com.digitalinnovationone.springbootjwt.data.UserData;
import com.digitalinnovationone.springbootjwt.service.UserDetailsServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private final UserDetailsServiceImpl userDetailsService;

    public UserController(UserDetailsServiceImpl userDatailsService) {
        this.userDetailsService = userDatailsService;
    }

    @RequestMapping("/all-users")
    public List<UserData> listAllUsers() {
        return userDetailsService.listUser();
    }
}
