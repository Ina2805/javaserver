package com.example.javaserver.Service.User;

import com.example.javaserver.Models.User;
import com.example.javaserver.Networking.User.UserNetworkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {


    @Autowired
    UserNetworkService userNetwork;
    @Override
    public List<User> getAllUsers() {
        return userNetwork.getAllUsers();
    }

    @Override
    public Boolean saveUser(User user) {
        return userNetwork.saveUser(user);
    }
    public Boolean deleteUser(String userId)
    {
        return userNetwork.deleteUser(userId);
    }

    @Override
    public Boolean editUser(User user) {
        return userNetwork.editUser(user);
    }

    public User getUserById(String userId)
    {
        return userNetwork.getUserById(userId);
    }
}
