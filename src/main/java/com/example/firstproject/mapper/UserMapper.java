package com.example.firstproject.mapper;

import com.example.firstproject.dto.UserDTO;
import com.example.firstproject.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public UserDTO toUserDTO(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setEmail(user.getEmail());
        userDTO.setName(user.getName());
        userDTO.setPhoneNumber(user.getPhoneNumber());
        userDTO.setImageId(user.getImageId());
        return userDTO;
    }
}
