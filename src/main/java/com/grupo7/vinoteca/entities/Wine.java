package com.grupo7.vinoteca.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity //Cuando se arranque la app esta anotacion permite que se mapee en la db como una tabla
@Table(name = "wines") //Sobreescribe el nombre de la tabla para el que queramos
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Wine extends Base{

    private String name;
    private String description;
    private long price;

    //private String image;
    private int stock;

    @ManyToOne(optional = false)
    @JoinColumn(name = "fk_brand")
    private Brand brand;

    @ManyToOne(optional = false)
    @JoinColumn(name = "fk_category")
    private Category category;

    //optional == si o si necesita un varietal
    @ManyToOne(optional = false)
    @JoinColumn(name = "fk_varietal")
    private Varietal varietal;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "fk_wine")
    private List<ImageWine> imagesWine = new ArrayList<ImageWine>();

}