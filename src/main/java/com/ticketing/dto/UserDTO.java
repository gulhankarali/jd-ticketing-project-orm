package com.ticketing.dto;

import com.ticketing.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Component
public class UserDTO {
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private boolean enabled;
    private String phone;
    private RoleDTO roleDTO;
    private Gender gender;
}
