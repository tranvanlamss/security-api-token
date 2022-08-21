package com.example.soundlife.dto;

import lombok.*;

import java.io.Serializable;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto implements Serializable {
    private int id;
    private String username;
    private String first_name;
    private String last_name;
    private String password;
    private int role_id;
    private RoleDto role;
}
