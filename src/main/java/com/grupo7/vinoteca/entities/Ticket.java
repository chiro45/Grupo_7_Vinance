package com.grupo7.vinoteca.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "tickets")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Ticket extends Base {



    private long number;
    private Date date;
    private int total;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_seller", nullable = false)
    private Seller seller;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_user", nullable = false)
    private User user;

    @OneToMany(mappedBy = "ticket", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TicketDetail> details;

}
