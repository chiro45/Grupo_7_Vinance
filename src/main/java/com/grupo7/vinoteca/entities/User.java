package com.grupo7.vinoteca.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User  extends Base{

    private String name;
    private String nick;
    private String lastName;
    private String email;
    protected String password;
    private String avatar;
    private Date birthday;

    @OneToMany(mappedBy = "user")
    private List<Ticket> ticket;

}