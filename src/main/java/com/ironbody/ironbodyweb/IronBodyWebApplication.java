package com.ironbody.ironbodyweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

/**
 * Clase principal de la aplicacion IronBodyWeb.
 */
@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "IronBodyWeb API", version = "1.0", description = "API para la aplicación IronBodyWeb"))
public class IronBodyWebApplication {

	/**
	 * Método principal que inicia la aplicacion Spring Boot.
	 *
	 * @param args Argumentos de la linea de comandos.
	 */
	public static void main(String[] args) {
		SpringApplication.run(IronBodyWebApplication.class, args);
	}
}