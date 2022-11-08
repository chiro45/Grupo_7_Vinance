package com.grupo7.vinoteca.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "sellers")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Seller extends Base {

    private String name;
    private String lastName;
    private String email;
    protected String password;
    private String avatar;
    private Date birthday;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Ticket> ticket;

    public Seller(long i, String fede) {
        setId(i);
        name=fede;
    }
}