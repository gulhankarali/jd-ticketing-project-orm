package com.ticketing.entity;

import com.ticketing.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Where;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Where(clause = "is_deleted=false")
@Table(name = "users")
public class User extends BaseEntity{


    private String firstName;
    private String lastName;
    private String userName;
    // private String passWord;
    private boolean enabled;
    private String phone;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id")
    private Role role;




}
