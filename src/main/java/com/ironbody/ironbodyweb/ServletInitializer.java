package com.ironbody.ironbodyweb;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;

/**
 * Clase que configura la inicialización del servlet para la aplicación Spring Boot.
 */
@OpenAPIDefinition
public class ServletInitializer extends SpringBootServletInitializer {

	/**
	 * Configura la aplicación Spring Boot para la inicializacion del servlet.
	 *
	 * @param application Constructor de la aplicacion.
	 * @return El constructor de la aplicación configurada.
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(IronBodyWebApplication.class);
	}

}