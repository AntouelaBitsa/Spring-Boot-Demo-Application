package com.example.springbootdemo.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRep;

    public List<User> getAllUsers(){
        return userRep.findAll();
    }

    public User getUserById(Long id){
        return userRep.findById(id).orElse(null);
    }

    public User saveUser(User user){
        return userRep.save(user);
    }

    public void deleteUser(Long id){
        userRep.deleteById(id);
    }

}
