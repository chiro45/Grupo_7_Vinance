package com.grupo7.vinoteca.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity //Cuando se arranque la app esta anotacion permite que se mapee en la db como una tabla
@Table(name = "brands") //Sobreescribe el nombre de la tabla para el que queramos
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Brand extends Base{

    @Column(name = "brand")
    private String brand;

}
