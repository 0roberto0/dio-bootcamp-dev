package com.digitalinnovationone.springbootjwt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

    @RequestMapping("/status")
    public String viewStatus() {
        return "Online";
    }
}
