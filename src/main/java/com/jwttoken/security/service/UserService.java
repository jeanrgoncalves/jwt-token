package com.jwttoken.security.service;

import com.jwttoken.controller.LoginDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import com.jwttoken.security.entity.User;
import com.jwttoken.security.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;

    public User save(LoginDTO loginDTO) {
        User user = new User();
        user.setEmail(loginDTO.getUser());
        user.setPass(new BCryptPasswordEncoder().encode(loginDTO.getPass()));
        return repository.save(user);
    }
}
