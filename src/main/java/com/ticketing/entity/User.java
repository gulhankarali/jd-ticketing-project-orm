package com.ticketing.entity;

import com.ticketing.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="users")
public class User extends BaseEntity {

    private String firstName;
    private String lastName;
    private boolean enabled;
    private String userName;
    private String password;
    private String phone;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name ="role_id")
    private Role role;

}
