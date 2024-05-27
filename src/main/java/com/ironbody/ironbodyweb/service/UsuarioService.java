package com.ironbody.ironbodyweb.service;

import java.util.List;
import com.ironbody.ironbodyweb.dto.UsuarioRegistroDTO;
import com.ironbody.ironbodyweb.model.Usuario;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

/**
 * Interfaz que define los servicios relacionados con los usuarios.
 */
@Service
@Tag(name = "Usuario", description = "Operaciones relacionadas con los usuarios")
public interface UsuarioService extends UserDetailsService {

    /**
     * Guarda un nuevo usuario.
     *
     * @param registroDTO DTO con los datos de registro del usuario.
     * @return El usuario guardado.
     */
    @Operation(summary = "Registrar usuario", description = "Guarda un nuevo usuario.")
    Usuario save(UsuarioRegistroDTO registroDTO);

    /**
     * Obtiene una lista de todos los usuarios.
     *
     * @return Lista de usuarios.
     */
    @Operation(summary = "Listar usuarios", description = "Obtiene una lista de todos los usuarios.")
    List<Usuario> listarUsuarios();

    /**
     * Elimina un usuario por su ID.
     *
     * @param id ID del usuario a eliminar.
     */
    @Operation(summary = "Eliminar usuario", description = "Elimina un usuario por su ID.")
    void eliminarUsuario(Long id);

    /**
     * Obtiene un usuario por su ID.
     *
     * @param id ID del usuario a obtener.
     * @return El usuario encontrado, o null si no existe.
     */
    @Operation(summary = "Obtener usuario por ID", description = "Obtiene un usuario por su ID.")
    Usuario obtenerUsuarioPorId(Long id);

    /**
     * Actualiza la informacion de un usuario.
     *
     * @param usuario El usuario con la informacion actualizada.
     */
    @Operation(summary = "Actualizar usuario", description = "Actualiza la información de un usuario.")
    void actualizarUsuario(Usuario usuario);

    /**
     * Obtiene un usuario por su correo electronico.
     *
     * @param email Correo electronico del usuario a buscar.
     * @return El usuario encontrado, o null si no existe.
     */
    @Operation(summary = "Obtener usuario por email", description = "Obtiene un usuario por su correo electrónico.")
    Usuario obtenerUsuarioPorEmail(String email);
}