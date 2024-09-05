package com.numerology.be.service;

import com.numerology.be.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public interface UserService {
    public List<User> getAllUsers();

    public Optional<User> getUserById(UUID id);

    public User saveUser(User user);

    public void deleteUser(UUID id);

}
