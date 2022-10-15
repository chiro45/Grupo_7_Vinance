package com.grupo7.vinoteca.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "ticketDetails")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TicketDetail extends Base {



    private int price;
    private int stock;
    private int subtotal;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_wine")
    private Wine wine;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_accessory")
    private Accessory accessory;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "fk_ticket")
    private Ticket ticket;
}