package com.ironbody.ironbodyweb.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Clase que representa un rol de usuario.
 */
@Entity
@Table(name = "rol")
@Schema(description = "Clase que representa un rol de usuario.")
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "ID del rol", example = "1")
    private Long id;

    @Schema(description = "Nombre del rol", example = "ROLE_USER")
    private String nombre;

    /**
     * Obtiene el ID del rol.
     *
     * @return ID del rol.
     */
    public Long getId() {
        return id;
    }

    /**
     * Establece el ID del rol.
     *
     * @param id ID del rol.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre del rol.
     *
     * @return Nombre del rol.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del rol.
     *
     * @param nombre Nombre del rol.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Constructor con todos los parámetros.
     *
     * @param id     ID del rol.
     * @param nombre Nombre del rol.
     */
    public Rol(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    /**
     * Constructor vacío.
     */
    public Rol() {
    }

    /**
     * Constructor con el nombre del rol.
     *
     * @param nombre Nombre del rol.
     */
    public Rol(String nombre) {
        this.nombre = nombre;
    }
}