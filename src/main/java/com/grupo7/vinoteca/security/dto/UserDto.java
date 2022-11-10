package com.grupo7.vinoteca.security.dto;

import lombok.*;

import java.util.HashSet;
import java.util.Set;
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private String name;
    private String username;
    private String email;
    private String password;
    private Set<String> roles = new HashSet<>();
}
