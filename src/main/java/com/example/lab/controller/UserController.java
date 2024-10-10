package com.example.lab.controller;

import com.example.lab.dto.UserDto;
import com.example.lab.mapper.UserMapper;
import com.example.lab.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/rest/users")
@RequiredArgsConstructor
public class UserController {
    private final UserMapper userMapper;
    private final UserService userService;

    @GetMapping
    public List<UserDto> getAllUsers() {
        return userService.findAllUsers()
                .stream()
                .map(userMapper::toDto)
                .collect(Collectors.toList());
    }
}
