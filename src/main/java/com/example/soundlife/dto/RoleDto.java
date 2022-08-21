package com.example.soundlife.dto;

import lombok.*;

import java.io.Serializable;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RoleDto implements Serializable {
    private int id;
    private String name;
}
