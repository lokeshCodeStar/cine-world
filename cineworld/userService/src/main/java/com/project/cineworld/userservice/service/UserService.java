package com.project.cineworld.userservice.service;

import com.project.cineworld.userservice.entity.User;
import com.project.cineworld.userservice.entity.dto.UserRegisterRequestDto;

public interface UserService {

    Boolean isUserExist(String userId);

    void addUser(UserRegisterRequestDto userRegisterRequestDto);

    User getUserByEmail(String email);

    boolean isUserCustomer();

    boolean isUserAdmin();
}