package com.ironbody.ironbodyweb.model;

import java.util.Collection;
import io.swagger.v3.oas.annotations.media.Schema;
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
 * Clase que representa un usuario en el sistema.
 */
@Entity
@Table(name = "usuarios", uniqueConstraints = @UniqueConstraint(columnNames = { "email" }))
@Schema(description = "Clase que representa un usuario en el sistema.")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "ID del usuario", example = "1")
    private Long id;

    @Column(name = "nombre")
    @Schema(description = "Nombre del usuario", example = "Juan Pérez")
    private String nombre;

    @Schema(description = "Correo electrónico del usuario", example = "juan.perez@example.com")
    private String email;

    @Schema(description = "Contraseña del usuario", example = "password123")
    private String password;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name = "usuarios_roles",
            joinColumns = @JoinColumn(name = "usuario_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "rol_id", referencedColumnName = "id")
    )
    @Schema(description = "Roles asociados al usuario")
    private Collection<Rol> roles;

    /**
     * Obtiene el ID del usuario.
     *
     * @return ID del usuario.
     */
    public Long getId() {
        return id;
    }

    /**
     * Establece el ID del usuario.
     *
     * @param id ID del usuario.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre del usuario.
     *
     * @return Nombre del usuario.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del usuario.
     *
     * @param nombre Nombre del usuario.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el correo electronico del usuario.
     *
     * @return Correo electronico del usuario.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Establece el correo electronico del usuario.
     *
     * @param email Correo electronico del usuario.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Obtiene la contrasena del usuario.
     *
     * @return Contrasena del usuario.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Establece la contrasena del usuario.
     *
     * @param password Contrasena del usuario.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Obtiene los roles asociados al usuario.
     *
     * @return Roles asociados al usuario.
     */
    public Collection<Rol> getRoles() {
        return roles;
    }

    /**
     * Establece los roles asociados al usuario.
     *
     * @param roles Roles asociados al usuario.
     */
    public void setRoles(Collection<Rol> roles) {
        this.roles = roles;
    }

    /**
     * Constructor con todos los parámetros.
     *
     * @param id       ID del usuario.
     * @param nombre   Nombre del usuario.
     * @param email    Correo electronico del usuario.
     * @param password Contrasena del usuario.
     * @param roles    Roles asociados al usuario.
     */
    public Usuario(Long id, String nombre, String email, String password, Collection<Rol> roles) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.roles = roles;
    }

    /**
     * Constructor sin el ID.
     *
     * @param nombre   Nombre del usuario.
     * @param email    Correo electronico del usuario.
     * @param password Contrasena del usuario.
     * @param roles    Roles asociados al usuario.
     */
    public Usuario(String nombre, String email, String password, Collection<Rol> roles) {
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.roles = roles;
    }

    /**
     * Constructor vacio.
     */
    public Usuario() {
    }
}