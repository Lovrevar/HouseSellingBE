package com.group5.service.services;

import com.group5.model.User;
import com.group5.model.UserDTO;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface UserService {

    User getUserById(String email);
    Optional<User> createUser(UserDTO user);
    boolean Login(String email, String password);
    Optional<User> registerUser(UserDTO user);
}
