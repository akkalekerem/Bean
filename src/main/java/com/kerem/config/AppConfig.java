package com.kerem.config;

import com.kerem.entity.User;
import com.kerem.services.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {

        @Bean
        public UserService userService(){
            UserService userService = new UserService();

            List<User> userList = new ArrayList<>();

            userList.add(new User("Kerem"));
            userList.add(new User("Bilal"));

            userService.setUserList(userList);
            return userService;
        }
}
