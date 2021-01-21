package com.ticketing.mapper;

import com.ticketing.dto.RoleDTO;
import com.ticketing.dto.UserDTO;
import com.ticketing.entity.Role;
import com.ticketing.entity.User;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    private ModelMapper modelMapper;

    @Autowired
    public UserMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public User convertToEntity(UserDTO dto){
        return modelMapper.map(dto, User.class);
    }

    public UserDTO convertToDto(User entity){
        return modelMapper.map(entity, UserDTO.class);
    }


}
