package com.bank.userservice.controller;

import com.bank.userservice.entity.User;
import com.bank.userservice.respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private  UserRepository userRepository;

    @PostMapping("/createuser")
    public String creatUser(@RequestBody User user){
        if(userRepository.existsByEmail(user.getEmail()) || userRepository.existsByUserName(user.getUserName())|| userRepository.existsByPhoneNumber(user.getPhoneNumber())){
            return "user with these details already exists";
        }
        try {
            userRepository.save(user);
            return "User "+ user.getUserName()+"is created successfully";
        }
        catch (Exception e){
            System.out.println(e.fillInStackTrace());
            return "User is not created due to some issue";
        }

    }
}
