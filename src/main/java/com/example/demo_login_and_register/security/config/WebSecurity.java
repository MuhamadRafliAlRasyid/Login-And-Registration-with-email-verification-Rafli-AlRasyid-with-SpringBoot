package com.example.demo_login_and_register.security.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

public interface WebSecurity {
    void configure(HttpSecurity http) throws Exception;

    void configure(AuthenticationManagerBuilder auth) throws Exception;
}
