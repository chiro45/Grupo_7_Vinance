package com.grupo7.vinoteca.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Vendedor")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Vendedor{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String alias;
    private String lastName;
    private String email;
    protected String password;
    private String avatar;

    @OneToMany(mappedBy = "seller")
    private List<Factura> ticket;
}
