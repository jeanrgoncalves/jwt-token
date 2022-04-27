package com.jwttoken.security.repository;

import org.springframework.data.repository.CrudRepository;
import com.jwttoken.security.entity.User;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Integer> {

    Optional<User> findByEmail(String email);

}
