package com.project.cineworld.userservice.service;


import com.project.cineworld.userservice.entity.dto.UserAuthenticationResponseDto;
import com.project.cineworld.userservice.entity.dto.UserLoginRequestDto;

public interface AuthService {

    UserAuthenticationResponseDto login(UserLoginRequestDto userLoginRequestDto);

}