package com.numerology.be.controller;

import com.numerology.be.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Controller
public interface UserController {
    @GetMapping
    public List<User> getAllUsers() ;

    @GetMapping("/{id}")
    public Optional<User> getUserById(@PathVariable UUID id) ;

    @PostMapping
    public User createUser(@RequestBody User user) ;

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable UUID id) ;
}
