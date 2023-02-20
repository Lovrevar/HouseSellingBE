package com.group5.controller;

import com.group5.model.User;
import com.group5.model.UserDTO;
import com.group5.model.UserLoginDTO;
import com.group5.security.JwtTokenUtil;
import com.group5.service.implementations.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    UserServiceImpl userService;
    @Autowired
    private final JwtTokenUtil jwtTokenUtil;



    public UserController(UserServiceImpl userService, JwtTokenUtil jwtTokenUtil)
    {
        this.userService=userService;
        this.jwtTokenUtil = jwtTokenUtil;
    }

    @GetMapping(value="/user/{email}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getUser(@PathVariable("email") String email){
        try {
            Optional<User> user = Optional.ofNullable(userService.getUserById(email));
            return user.map(value -> new ResponseEntity<Object>(value, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.OK));
        } catch (Exception ex) {
            return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/createUser")
    public Optional<User> createUser(@RequestBody UserDTO user){
        return userService.registerUser(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody UserLoginDTO userDto){

        if(userService.Login(userDto.email, userDto.password)){
            // Generating JWT Token
            User user = userService.getUserById(userDto.email);
            String JWT = jwtTokenUtil.generateToken(user.getEmail());
            return JWT;
        }else{
            System.out.println("wrong");
            return "Wrong Email or Password";
        }
    }
}
