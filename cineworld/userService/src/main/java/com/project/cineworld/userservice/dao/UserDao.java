package com.project.cineworld.userservice.dao;

import com.project.cineworld.userservice.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserDao extends MongoRepository<User, String> {

    User findUserByUserId(String userId);

    User findUserByEmail(String email);
}