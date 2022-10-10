package com.grupo7.vinoteca.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class User_information {
    private String name;
    private String alias;
    private String lastName;
    private String email;
    protected String password;
    private String avatar;
}
