package com.grupo7.vinoteca.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity //Cuando se arranque la app esta anotacion permite que se mapee en la db como una tabla
@Table(name = "wines") //Sobreescribe el nombre de la tabla para el que queramos
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Wine extends Base {

    @Size(min = 4,
            max = 100,
            message = "El name debe tener entre 4 y 100 caracteres")
    private String name;

    @Size(min = 4,
            max = 1000,
            message = "description debe tener entre 4 y 1000 caracteres")
    private String description;

    @Min(value = 100, message = "El precio minimo es 100")
    private double price;

    @Min(value = 0, message = "El stock minimo es 0")
    private int stock;

    private boolean active;

    @ManyToOne
    @JoinTable(name = "wine_brand", joinColumns = @JoinColumn(name = "wine_id"), inverseJoinColumns = @JoinColumn(name = "brand_id"))
    private Brand brand;

    @ManyToOne
    @JoinTable(name = "wine_category", joinColumns = @JoinColumn(name = "wine_id"), inverseJoinColumns = @JoinColumn(name = "category_id"))
    private Category category;

    @ManyToOne
    @JoinTable(name = "wine_varietal", joinColumns = @JoinColumn(name = "wine_id"), inverseJoinColumns = @JoinColumn(name = "varietal_id"))
    private Varietal varietal;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "fk_wine")
    private List<ImageWine> images = new ArrayList<ImageWine>();

    private String type = "Wines";


}