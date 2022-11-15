package com.grupo7.vinoteca.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity //Cuando se arranque la app esta anotacion permite que se mapee en la db como una tabla
@Table(name = "accessories") //Sobreescribe el nombre de la tabla para el que queramos
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Accessory extends Base {

    @Size(min = 4,
            max = 20,
            message = "El name debe tener entre 4 y 20 caracteres")
    private String name;

    @Size(min = 4,
            max = 1000,
            message = "description debe tener entre 4 y 1000 caracteres")
    private String description;

    @Min(value = 100, message = "El precio minimo es 100")
    private long price;

    @Min(value = 0, message = "El precio minimo es 0")
    private int stock;
    private boolean active;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "fk_accesory")
    private List<ImageAccessory> images = new ArrayList<ImageAccessory>();

    private String type = "Accessory";

}