package com.ironbody.ironbodyweb.model;

import java.util.Collection;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

/**
 * Clase que representa la entidad "Usuario" en la base de datos.
 */

@Entity
@Table(name = "usuarios", uniqueConstraints = @UniqueConstraint(columnNames = { "email" }))
public class Usuario {

    // Selección de ID y Datos a solicitar al usuario

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    private String email;
    private String password;

    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinTable(
            name = "usuarios_roles",
            joinColumns = @JoinColumn(
                    name = "usuario_id",referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "rol_id",referencedColumnName = "id")
    )

    // Relación entre ID de usuario y roles

    private Collection<Rol> roles;
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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Collection<Rol> getRoles() {
        return roles;
    }
    public void setRoles(Collection<Rol> roles) {
        this.roles = roles;
    }

    // Constructores

    public Usuario(Long id, String nombre, String email, String password, Collection<Rol> roles) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.roles = roles;
    }
    public Usuario(String nombre, String email, String password, Collection<Rol> roles) {
        super();
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.roles = roles;
    }
    public Usuario() {
        super();
    }



}