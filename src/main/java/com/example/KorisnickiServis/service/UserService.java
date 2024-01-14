package com.example.KorisnickiServis.service;

import com.example.KorisnickiServis.dto.TokenRequestDto;
import com.example.KorisnickiServis.dto.TokenResponseDto;
import com.example.KorisnickiServis.dto.UserCreateDto;
import com.example.KorisnickiServis.dto.UserDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {

    Page<UserDto> findAll(Pageable pageable);

    UserDto add(UserCreateDto userCreateDto);

    TokenResponseDto login(TokenRequestDto tokenRequestDto);
}
