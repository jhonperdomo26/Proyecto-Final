package com.ironbody.ironbodyweb.repository;

import com.ironbody.ironbodyweb.model.Usuario;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositorio para la entidad Usuario.
 */
@Repository
@Tag(name = "Usuario", description = "Operaciones relacionadas con los usuarios")
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    /**
     * Busca un usuario por su correo electronico.
     *
     * @param email Correo electronico del usuario a buscar.
     * @return Usuario encontrado, o null si no se encuentra.
     */
    @Operation(summary = "Buscar usuario por correo electrónico", description = "Busca un usuario por su correo electrónico.")
    Usuario findByEmail(String email);
}