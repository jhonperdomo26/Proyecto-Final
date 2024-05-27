package com.ironbody.ironbodyweb.controllers;

import com.ironbody.ironbodyweb.dto.UsuarioRegistroDTO;
import com.ironbody.ironbodyweb.service.UsuarioService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Controller
@RequestMapping("/registro")
@Tag(name = "RegistroController", description = "Controlador para manejar el registro de nuevos usuarios.")
public class RegistroController {

    private final UsuarioService usuarioService;

    public RegistroController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    /**
     * Proporciona un objeto UsuarioRegistroDTO a la vista.
     *
     * @return Un nuevo objeto UsuarioRegistroDTO.
     */
    @ModelAttribute("usuario")
    public UsuarioRegistroDTO retornarNuevoUsuarioRegistroDTO() {
        return new UsuarioRegistroDTO();
    }

    /**
     * Muestra el formulario de registro de usuario.
     *
     * @return La vista del formulario de registro.
     */
    @Operation(summary = "Mostrar formulario de registro de usuario")
    @GetMapping
    public String mostrarFormularioDeRegistro() {
        return "registro";
    }

    /**
     * Registra una nueva cuenta de usuario.
     *
     * @param registroDTO Datos de registro del usuario.
     * @return Redirecciona a la pagina de registro con un mensaje de exito.
     */
    @Operation(summary = "Registrar una nueva cuenta de usuario")
    @PostMapping
    public String registrarCuentaDeUsuario(@ModelAttribute("usuario") UsuarioRegistroDTO registroDTO) {
        usuarioService.save(registroDTO);
        return "redirect:/registro?exito=true";
    }
}