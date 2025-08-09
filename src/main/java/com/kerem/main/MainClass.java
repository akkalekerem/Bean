package com.kerem.main;

import com.kerem.entity.User;
import com.kerem.services.UserService;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {

        UserService userService = new UserService();

         List<User> userList = new ArrayList<>();

         userList.add(new User("Kerem"));
         userList.add(new User("Bilal"));
         userService.setUserList(userList);

         UserService userService2 = new UserService();
    }
}
