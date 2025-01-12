package com.bank.userservice.respository;

import com.bank.userservice.entity.Address;
import com.bank.userservice.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class userRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void saveUser(){
        User user= User.builder().userName("anurag").email("anurag@gmail.com").password("anurag123").phoneNumber("9381261538").createdAt(LocalDateTime.now()).updatedAt(LocalDateTime.now()).isActive(true).fullName("anuragsharma").password("anurag@123").build();
        userRepository.save(user);
    }

    @Test
    public void saveUserWithAddress(){
        Address adr= Address.builder().city("hyd").pincode("503003").state("telangana").build();

        User user= User.builder().userName("nidhi").email("nidhi@gmail.com").password("nidhi123").phoneNumber("9381261537").createdAt(LocalDateTime.now()).updatedAt(LocalDateTime.now()).isActive(true).fullName("anuragsharma").password("anurag@123").address(adr).build();
        userRepository.save(user);
    }

    @Test
    public void listOfStudenents(){
        List<User> user= userRepository.findAll();
        System.out.println(user);
    }

    @Test
    public void printStudentByUserName(){
        List<User> user= userRepository.findByUserName("anurag");
        System.out.println(user);
    }

    @Test
    public void printStudentByEmail(){
        User user= userRepository.getUserByEmail("anurag@gmail.com");
        System.out.println(user);
    }




}