package com.ironbody.ironbodyweb.service;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import com.ironbody.ironbodyweb.dto.UsuarioRegistroDTO;
import com.ironbody.ironbodyweb.model.Rol;
import com.ironbody.ironbodyweb.model.Usuario;
import com.ironbody.ironbodyweb.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * Implementacion del servicio de usuarios.
 */
@Service
@Tag(name = "Usuario", description = "Operaciones relacionadas con los usuarios")
public class UsuarioServiceImpl implements UsuarioService {

    private final BCryptPasswordEncoder passwordEncoder;
    private final UsuarioRepository usuarioRepository;

    /**
     * Constructor de la clase.
     *
     * @param passwordEncoder    Codificador de contrasenas.
     * @param usuarioRepository Repositorio de usuarios.
     */
    @Autowired
    public UsuarioServiceImpl(BCryptPasswordEncoder passwordEncoder, UsuarioRepository usuarioRepository) {
        this.passwordEncoder = passwordEncoder;
        this.usuarioRepository = usuarioRepository;
    }

    /**
     * Registra un nuevo usuario.
     *
     * @param registroDTO DTO con los datos de registro del usuario.
     * @return El usuario registrado.
     */
    @Override
    @Operation(summary = "Registrar usuario", description = "Registra un nuevo usuario.")
    public Usuario save(UsuarioRegistroDTO registroDTO) {
        Usuario usuario = new Usuario(registroDTO.getNombre(), registroDTO.getEmail(),
                passwordEncoder.encode(registroDTO.getPassword()), Arrays.asList(new Rol("ROLE_USER")));
        return usuarioRepository.save(usuario);
    }

    /**
     * Carga un usuario por su nombre de usuario (correo electronico).
     *
     * @param username Nombre de usuario (correo electronico).
     * @return Detalles del usuario.
     * @throws UsernameNotFoundException Si no se encuentra el usuario.
     */
    @Override
    @Operation(summary = "Cargar usuario por nombre de usuario", description = "Carga un usuario por su nombre de usuario (correo electrónico).")
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = usuarioRepository.findByEmail(username);
        if (usuario == null) {
            throw new UsernameNotFoundException("Usuario o contraseña inválidos");
        }
        return new User(usuario.getEmail(), usuario.getPassword(), mapearAutoridadesRoles(usuario.getRoles()));
    }

    /**
     * Mapea los roles del usuario a autoridades de Spring Security.
     *
     * @param roles Roles del usuario.
     * @return Autoridades de Spring Security.
     */
    private Collection<? extends GrantedAuthority> mapearAutoridadesRoles(Collection<Rol> roles) {
        return roles.stream().map(role -> new SimpleGrantedAuthority(role.getNombre())).collect(Collectors.toList());
    }

    /**
     * Obtiene una lista de todos los usuarios.
     *
     * @return Lista de usuarios.
     */
    @Override
    @Operation(summary = "Listar usuarios", description = "Obtiene una lista de todos los usuarios.")
    public List<Usuario> listarUsuarios() {
        return usuarioRepository.findAll();
    }

    /**
     * Elimina un usuario por su ID.
     *
     * @param id ID del usuario a eliminar.
     */
    @Override
    @Operation(summary = "Eliminar usuario", description = "Elimina un usuario por su ID.")
    public void eliminarUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }

    /**
     * Obtiene un usuario por su ID.
     *
     * @param id ID del usuario a obtener.
     * @return El usuario encontrado, o null si no existe.
     */
    @Override
    @Operation(summary = "Obtener usuario por ID", description = "Obtiene un usuario por su ID.")
    public Usuario obtenerUsuarioPorId(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    /**
     * Actualiza la informacion de un usuario.
     *
     * @param usuario El usuario con la informacion actualizada.
     */
    @Override
    @Operation(summary = "Actualizar usuario", description = "Actualiza la información de un usuario.")
    public void actualizarUsuario(Usuario usuario) {
        Usuario usuarioExistente = usuarioRepository.findById(usuario.getId()).orElse(null);
        if (usuarioExistente != null) {
            if (usuario.getPassword() == null || usuario.getPassword().isEmpty()) {
                usuario.setPassword(usuarioExistente.getPassword());
            } else {
                usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));
            }
            usuario.setRoles(usuarioExistente.getRoles());
            usuarioRepository.save(usuario);
        }
    }

    /**
     * Obtiene un usuario por su correo electronico.
     *
     * @param email Correo electronico del usuario a buscar.
     * @return El usuario encontrado, o null si no existe.
     */
    @Override
    @Operation(summary = "Obtener usuario por email", description = "Obtiene un usuario por su correo electrónico.")
    public Usuario obtenerUsuarioPorEmail(String email) {
        return usuarioRepository.findByEmail(email);
    }

}