package edu.iu.p466.prime_service.controller;

import edu.iu.p466.prime_service.model.Customer;
import edu.iu.p466.prime_service.service.IAuthenticationService;
import edu.iu.p466.prime_service.service.TokenService;
import org.apache.el.parser.Token;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class AuthenticationController {

    private final IAuthenticationService authenticationService;

    private final AuthenticationManager authenticationManager;

    private final TokenService tokenService;

    public AuthenticationController(AuthenticationManager authenticationManager,
                                    IAuthenticationService authenticationService,
                                    TokenService tokenService) {
        this.authenticationService = authenticationService;
        this.authenticationManager = authenticationManager;
        this.tokenService = tokenService;
    }


    @PostMapping("/")
    public boolean register(){
        System.out.println("Hello!");
    }

    @PostMapping("/add/{n}/{m}")
    public String add(){
      System.out.println("Hello");


    }


}
