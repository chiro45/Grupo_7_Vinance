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
public class Vendedor extends User_information{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "vendedor")
    private List<Factura> ticket;
}
