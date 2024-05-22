package com.ironbody.ironbodyweb.controllers;

import com.ironbody.ironbodyweb.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;
import java.util.Collection;


@Controller
@RequestMapping("/")
public class MainController {


    @Autowired
    private UsuarioService servicio;


    @GetMapping("/inicio")
    public String index() { return "index"; }


    @GetMapping("/tienda")
    public String tienda() { return "tienda"; }


    @GetMapping("/clases")
    public String clases() { return "clases"; }


    @GetMapping("/sobre_nosotros")
    public String sobre_nosotros() { return "sobre_nosotros"; }


    @GetMapping("/contacto")
    public String Contacto() { return "contacto"; }

    @GetMapping("/inicio-sesion")
    public String Login() { return "inicio-sesion"; }

    @GetMapping("home")
    public String tuMetodo(Model model, Principal principal) {
        String username = principal.getName();

        model.addAttribute("username", username);

        Collection<? extends GrantedAuthority> authorities = ((Authentication) principal).getAuthorities();

        boolean isAdmin = authorities.stream()
                .anyMatch(role -> role.getAuthority().equals("ROLE_ADMIN"));

        model.addAttribute("username", username);
        model.addAttribute("isAdmin", isAdmin);

        return "home";
    }

}
