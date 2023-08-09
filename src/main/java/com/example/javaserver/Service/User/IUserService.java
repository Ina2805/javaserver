package com.example.javaserver.Service.User;

import com.example.javaserver.Models.User;

import java.util.List;

public interface IUserService {
    List<User> getAllUsers();

    Boolean saveUser(User user);
    Boolean deleteUser(String userId);
    Boolean editUser(User user);

    User getUserById(String userId);
}
