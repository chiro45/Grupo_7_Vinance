package com.grupo7.vinoteca.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "detalleFactura")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DetalleFactura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int price;
    private int stock;
    private int subtotal;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_wine")
    private Wines wine;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_accesory")
    private Accessories accessory;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "fk_factura")
    private Factura ticket;
}