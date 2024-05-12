package com.titaniclift.titanicliftweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping
public class headerController {

    @GetMapping("/inicio")
    public String Index() {

        return "index";

    }

    @GetMapping("/tienda")
    public String Tienda() {

        return "tienda";

    }

    @GetMapping("/clases")
    public String Clases() {

        return "clases";

    }

    @GetMapping("/sobre_nosotros")
    public String Sobre_nosotros() {

        return "sobre_nosotros";

    }

    @GetMapping("/contacto")
    public String Contacto() {

        return "contacto";

    }

}
