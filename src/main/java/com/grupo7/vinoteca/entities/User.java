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

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Ticket> ticket;


    //PRueba
    public User(long i, String james_bond) {
        setId(i);
        name = james_bond;
    }
}