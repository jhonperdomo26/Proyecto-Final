package com.ironbody.ironbodyweb.dto;

import lombok.Getter;
import lombok.Setter;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * DTO para el registro de usuarios.
 */
@Getter
@Setter
@Schema(description = "DTO para el registro de usuarios")
public class UsuarioRegistroDTO {

    @Schema(description = "ID del usuario", example = "1")
    private Long id;

    @Schema(description = "Nombre del usuario", example = "Juan Pérez")
    private String nombre;

    @Schema(description = "Correo electrónico del usuario", example = "juan.perez@example.com")
    private String email;

    @Schema(description = "Contraseña del usuario", example = "password123")
    private String password;

    /**
     * Constructor con todos los parametros.
     *
     * @param id       ID del usuario.
     * @param nombre   Nombre del usuario.
     * @param email    Correo electronico del usuario.
     * @param password Contrasena del usuario.
     */
    public UsuarioRegistroDTO(Long id, String nombre, String email, String password) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.password = password;
    }

    /**
     * Constructor sin el ID.
     *
     * @param nombre   Nombre del usuario.
     * @param email    Correo electronico del usuario.
     * @param password Contrasena del usuario.
     */
    public UsuarioRegistroDTO(String nombre, String email, String password) {
        super();
        this.nombre = nombre;
        this.email = email;
        this.password = password;
    }

    /**
     * Constructor solo con el correo electronico.
     *
     * @param email Correo electronico del usuario.
     */
    public UsuarioRegistroDTO(String email) {
        super();
        this.email = email;
    }

    /**
     * Constructor vacio.
     */
    public UsuarioRegistroDTO() {
        super();
    }
}