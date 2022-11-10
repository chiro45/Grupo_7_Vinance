package com.grupo7.vinoteca.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "sellers")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Seller extends Base {

    private String name;
    private String lastName;
    @Column(unique = true)
    private String email;
    protected String password;
    private String avatar;
    private Date birthday;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Ticket> ticket;

}