package com.example.javaserver.Networking.User;

import com.example.javaserver.Models.User;

import java.util.List;

public interface IUserNetwork {
    List<User> getAllUsers();
    Boolean saveUser(User user);
    Boolean deleteUser(String userid);

}
