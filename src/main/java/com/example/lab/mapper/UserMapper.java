package com.example.lab.mapper;

import com.example.lab.dto.UserDto;
import com.example.lab.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public UserDto toDto(User user) {
        return new UserDto(user.getName(), user.getSurname(),
                user.getEmail(), user.getContactNumber());
    }
}
