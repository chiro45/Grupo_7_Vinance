package com.grupo7.vinoteca.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity //Cuando se arranque la app esta anotacion permite que se mapee en la db como una tabla
@Table(name = "wines") //Sobreescribe el nombre de la tabla para el que queramos
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Wines extends Base_Information {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String category;
    private String varietal;




}
