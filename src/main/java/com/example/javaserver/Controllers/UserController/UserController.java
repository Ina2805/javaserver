package com.example.javaserver.Controllers.UserController;

import com.example.javaserver.Models.User;
import com.example.javaserver.Service.User.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    IUserService userService;

    @GetMapping("/users")
    public List<User> getAllUsers()
    {
        List<User> users = userService.getAllUsers();
        if (users==null)
        {
            System.out.println("No Users Returned");
        }
        return users;
    }
    @GetMapping("/users/{userid}")
    public User getUserById(@PathVariable String userid)
    {
        User user = userService.getUserById(userid);
        if (user==null)
        {
            System.out.println("No User Found");
        }
        return user;
    }


    @PostMapping("/users")
    public Boolean saveUser(@RequestBody User user)
    {
        Boolean response = userService.saveUser(user);
        return response;
    }
    @DeleteMapping("/user/{userid}")
    public boolean deleteUser(@PathVariable String userid)
    {
        Boolean response = userService.deleteUser(userid);
        return response;
    }
    @PutMapping("/users/edit")
    public Boolean editUser(@RequestBody User user) {
        Boolean response = userService.editUser(user);
        return response;
    }

}
