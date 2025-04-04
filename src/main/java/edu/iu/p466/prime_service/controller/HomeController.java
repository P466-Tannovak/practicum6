package edu.iu.p466.prime_service.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class HomeController {
    @GetMapping("/")
    public String greet() {
        return "Hello!";
    }

    @GetMapping("/add/{n}/{m}")
    public int add(@PathVariable int n, @PathVariable int m) {
        return n + m;
    }
}
