package com.dio.jwt.controllers;

import com.dio.jwt.dtos.Login;
import com.dio.jwt.dtos.Sessao;
import com.dio.jwt.model.User;
import com.dio.jwt.repositories.UserRepository;
import com.dio.jwt.security.JWTCreator;
import com.dio.jwt.security.JWTObject;
import com.dio.jwt.security.SecurityConfig;
import com.dio.jwt.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;

@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    public Sessao logar(@RequestBody Login login){
        return loginService.login(login);
    }
}
