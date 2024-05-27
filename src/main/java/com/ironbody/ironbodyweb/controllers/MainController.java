package com.ironbody.ironbodyweb.controllers;

import com.ironbody.ironbodyweb.model.Usuario;
import com.ironbody.ironbodyweb.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.security.Principal;
import java.util.Collection;

@Controller
@Tag(name = "MainController", description = "Controlador principal para manejar las solicitudes de la aplicación web.")
public class MainController {

    @Autowired
    private UsuarioService servicio;

    /**
     * Muestra la pagina de inicio de sesion.
     *
     * @return La vista de inicio de sesion.
     */
    @Operation(summary = "Mostrar página de inicio de sesión")
    @GetMapping("login")
    public String IniciarSesion() {
        return "login";
    }

    /**
     * Muestra la pagina principal.
     *
     * @return La vista de la pagina principal.
     */
    @Operation(summary = "Mostrar página principal")
    @GetMapping("/")
    public String Inicio() {
        return "index";
    }

    /**
     * Muestra la pagina de inicio.
     *
     * @return La vista de la pagina de inicio.
     */
    @Operation(summary = "Mostrar página de inicio")
    @GetMapping("/inicio")
    public String Index() {
        return "index";
    }

    /**
     * Muestra la pagina de clases.
     *
     * @return La vista de la pagina de clases.
     */
    @Operation(summary = "Mostrar página de clases")
    @GetMapping("/clases")
    public String clases() {
        return "clases";
    }

    /**
     * Muestra la pagina sobre nosotros.
     *
     * @return La vista de la pagina sobre nosotros.
     */
    @Operation(summary = "Mostrar página sobre nosotros")
    @GetMapping("/sobre_nosotros")
    public String Sobre_nosotros() {
        return "sobre_nosotros";
    }

    /**
     * Muestra la pagina de contacto.
     *
     * @return La vista de la pagina de contacto.
     */
    @Operation(summary = "Mostrar página de contacto")
    @GetMapping("/contacto")
    public String Contacto() {
        return "contacto";
    }

    /**
     * Muestra la pagina de inicio del usuario.
     *
     * @param model    Modelo para pasar datos a la vista.
     * @param principal Principal para obtener informacion del usuario autenticado.
     * @return La vista de la pagina de inicio del usuario.
     */
    @Operation(summary = "Mostrar página de inicio del usuario")
    @GetMapping("home")
    public String metodohome(Model model, Principal principal) {
        String username = principal.getName();
        model.addAttribute("username", username);

        Collection<? extends GrantedAuthority> authorities = ((Authentication) principal).getAuthorities();
        boolean isAdmin = authorities.stream()
                .anyMatch(role -> role.getAuthority().equals("ROLE_ADMIN"));

        model.addAttribute("isAdmin", isAdmin);
        return "home";
    }

    /**
     * Muestra el menú de administracion.
     *
     * @param model    Modelo para pasar datos a la vista.
     * @param principal Principal para obtener informacion del usuario autenticado.
     * @return La vista del menu de administracion.
     */
    @Operation(summary = "Mostrar menú de administración")
    @Secured("ROLE_ADMIN")
    @GetMapping("/adminmenu")
    public String adminmenu(Model model, Principal principal) {
        String username = principal.getName();
        model.addAttribute("username", username);

        Collection<? extends GrantedAuthority> authorities = ((Authentication) principal).getAuthorities();
        boolean isAdmin = authorities.stream()
                .anyMatch(role -> role.getAuthority().equals("ROLE_ADMIN"));

        model.addAttribute("isAdmin", isAdmin);
        model.addAttribute("usuarios", servicio.listarUsuarios());
        return "adminmenu";
    }

    /**
     * Muestra la pagina para editar un usuario.
     *
     * @param id    ID del usuario a editar.
     * @param model Modelo para pasar datos a la vista.
     * @return La vista de la página de edición del usuario.
     */
    @Operation(summary = "Mostrar página para editar un usuario")
    @GetMapping("/edit/{id}")
    public String editarUsuario(@PathVariable Long id, Model model) {
        Usuario usuario = servicio.obtenerUsuarioPorId(id);
        model.addAttribute("usuario", usuario);
        return "edit";
    }

    /**
     * Actualiza un usuario.
     *
     * @param usuario Usuario con los datos actualizados.
     * @return Redirecciona al menú de administracion.
     */
    @Operation(summary = "Actualizar un usuario")
    @PostMapping("/actualizarUsuario")
    public String actualizarUsuario(@ModelAttribute Usuario usuario) {
        servicio.actualizarUsuario(usuario);
        return "redirect:/adminmenu";
    }

    /**
     * Elimina un usuario.
     *
     * @param id ID del usuario a eliminar.
     * @return Redirecciona al menú de administracion con un mensaje de exito.
     */
    @Operation(summary = "Eliminar un usuario")
    @PostMapping("/eliminarUsuario/{id}")
    public String eliminarUsuario(@RequestParam Long id) {
        servicio.eliminarUsuario(id);
        return "redirect:/adminmenu?exito=true";
    }
}