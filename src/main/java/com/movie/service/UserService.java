package com.movie.service;

import com.movie.entity.User;
import com.movie.exception.UserNotFoundException;
import com.movie.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User getUserByUserName(String userName) {

        User user=userRepository.findByUserName(userName);
        if (user == null) {
            throw new UserNotFoundException("User not found for username: " + userName);
        }
        return user;
    }
}
