package com.ticketing.service;

import com.ticketing.dto.UserDTO;
import com.ticketing.entity.User;
import com.ticketing.exception.TicketingProjectException;

import java.util.List;

public interface UserService {

    List<UserDTO> listAllUsers();

    UserDTO findByUserName(String userName);

    void save(UserDTO dto);

    UserDTO update(UserDTO dto);

    void delete(String userName) throws TicketingProjectException;;

    void deleteByUserName(String username);

    List<UserDTO> listAllByRole(String role);

    Boolean checkIfUserCanBeDeleted(User user);

}
