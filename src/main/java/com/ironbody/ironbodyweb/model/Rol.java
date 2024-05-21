package com.ironbody.ironbodyweb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Clase que representa la entidad "Rol" en la base de datos.
 */

@Entity
@Table(name = "rol")
public class Rol {

    // Datos que contiene la tabla "rol"

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    public Long getId() {
        return id;
    }

    // Getters y Setters para los campos

    public void setId(Long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Constructores

    public Rol(Long id, String nombre) {
        super();
        this.id = id;
        this.nombre = nombre;
    }
    public Rol() {
        super();
    }
    public Rol(String nombre) {
        super();
        this.nombre = nombre;
    }
}