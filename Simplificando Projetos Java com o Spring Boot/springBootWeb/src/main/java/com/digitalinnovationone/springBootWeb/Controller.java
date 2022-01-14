package com.digitalinnovationone.springBootWeb;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
public class Controller {

    @GetMapping("/")
    public String mensagem() {
        return "Nosso primeiro projeto Spring Boot Web";
    }
}
