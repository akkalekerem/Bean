package com.kerem.main;

import com.kerem.config.AppConfig;
import com.kerem.entity.User;
import com.kerem.services.LoginService;
import com.kerem.services.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);

        System.out.println(userService.getUserList());

        for (User user : userService.getUserList()) {
            System.out.println(user);
        }
        LoginService loginService = new LoginService();
        loginService.login();;
    }
}
