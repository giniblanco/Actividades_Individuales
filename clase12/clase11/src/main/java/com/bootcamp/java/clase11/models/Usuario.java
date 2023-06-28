package com.bootcamp.java.clase11.models;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {


    private Integer id;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
}
