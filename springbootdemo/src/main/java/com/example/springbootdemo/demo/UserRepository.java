package com.example.springbootdemo.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.springbootdemo.demo.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
