package com.incad.report.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.HashSet;
import java.util.Set;

public class User{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Nombre de usuario es obligatorio")
    @Size( max = 10)
    private String username;

    @NotBlank(message = "La contraseña es obligatoria")
    @Size( max = 10)
    private String password;    

}

