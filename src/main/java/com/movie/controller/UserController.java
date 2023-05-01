package com.movie.controller;

import com.movie.entity.User;
import com.movie.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{username}")
    public User getUserByUserName(@PathVariable("username") String username){
        return userService.getUserByUserName(username);
    }

   @PostMapping("/")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
   }
}
