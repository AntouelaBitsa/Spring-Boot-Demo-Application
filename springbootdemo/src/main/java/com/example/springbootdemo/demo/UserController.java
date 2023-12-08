package com.example.springbootdemo.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getAllUsers")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    //register user mapping

    //this is a http request
    @GetMapping("/getUser")
    public User getUser() {
        User name = new User(1L, "ninlnlkku@hbjk", "iuhiuhuh");
        return name;
//        return "Hello World";
    }


    @GetMapping("/getUserById")
    public User getUsersById(@PathVariable Long id){
        return userService.getUserById(id);
    }

    @PostMapping("/saveUser")
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @DeleteMapping("/deleteuser")
    public void deleteuser(@PathVariable Long id){
        userService.deleteUser(id);
    }

    @PostMapping("/createUser")
    public User createUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    //update
}
