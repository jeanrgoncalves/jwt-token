package com.jwttoken.controller;

import com.jwttoken.security.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.jwttoken.security.service.UserService;

import java.net.URI;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserService service;

    @PostMapping
    public ResponseEntity<User> saveUser(@RequestBody LoginDTO loginDTO) {
        User savedUser = service.save(loginDTO);
        return ResponseEntity.created(URI.create("/users/" + savedUser.getId())).build();
    }

}
