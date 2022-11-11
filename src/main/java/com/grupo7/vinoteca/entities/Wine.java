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
    private boolean active;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_brand")
    private Brand brand;

    @ManyToOne
    @JoinTable(name = "wine_category", joinColumns = @JoinColumn(name = "wine_id"), inverseJoinColumns = @JoinColumn(name = "category_id"))
    //@JoinColumn(name = "fk_category")
    private Category category;

    //optional == si o si necesita un varietal
    @ManyToOne
    @JoinTable(name = "wine_varietal", joinColumns = @JoinColumn(name = "wine_id"), inverseJoinColumns = @JoinColumn(name = "varietal_id"))
    //@JoinColumn(name = "fk_varietal")
    private Varietal varietal;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "fk_wine")
    private List<ImageWine> imagesWine = new ArrayList<ImageWine>();


    //@JoinTable(name = "user_rol", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "rol_id"))
}