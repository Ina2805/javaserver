package com.example.javaserver.Service.User;

import com.example.javaserver.Models.User;
import com.example.javaserver.Networking.User.UserNetwork;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {


    @Autowired
    UserNetwork userNetwork;
    @Override
    public List<User> getAllUsers() {
        System.out.println(userNetwork.getAllUsers());
        return userNetwork.getAllUsers();
    }
}