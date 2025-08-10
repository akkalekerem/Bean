package com.kerem.services;

import com.kerem.config.AppConfig;
import lombok.Data;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Data
public class LoginService {
    public void login(){
        //User listesine ihtiyacım var.
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
    }
}
