package com.kerem.services;

import com.kerem.entity.User;
import lombok.Data;

import java.util.List;


@Data
public class UserService {

    private List<User> userList;
}
