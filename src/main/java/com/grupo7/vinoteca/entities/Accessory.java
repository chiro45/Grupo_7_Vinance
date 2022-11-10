package com.grupo7.vinoteca.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity //Cuando se arranque la app esta anotacion permite que se mapee en la db como una tabla
@Table(name = "accessories") //Sobreescribe el nombre de la tabla para el que queramos
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Accessory extends Base {

    private String name;
    private String description;
    private long price;
    private int stock;
    private boolean activo;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "fk_accesory")
    private List<ImageAccessory> imagesAccesory = new ArrayList<ImageAccessory>();


}