package com.ironbody.ironbodyweb.i18n;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import java.util.Locale;

/**
 * Configuracion para la internacionalizacion (i18n) de la aplicacion.
 */
@Configuration
public class i18n implements WebMvcConfigurer {

	/**
	 * Define el LocaleResolver que se utiliza para resolver la configuración regional basada en la sesion del usuario.
	 *
	 * @return un SessionLocaleResolver configurado con el idioma por defecto en espanol.
	 */
	@Bean
	public LocaleResolver localeResolver() {
		SessionLocaleResolver sessionLocaleResolver = new SessionLocaleResolver();
		sessionLocaleResolver.setDefaultLocale(new Locale("es"));
		return sessionLocaleResolver;
	}

	/**
	 * Define el interceptor para cambiar la configuracion regional basada en el parametro de solicitud 'lang'.
	 *
	 * @return un LocaleChangeInterceptor configurado con 'lang' como el nombre del parametro.
	 */
	@Bean
	public LocaleChangeInterceptor localeChangeInterceptor() {
		LocaleChangeInterceptor localeChangeInterceptor = new LocaleChangeInterceptor();
		localeChangeInterceptor.setParamName("lang");
		return localeChangeInterceptor;
	}

	/**
	 * Añade el LocaleChangeInterceptor al registro de interceptores.
	 *
	 * @param registry el registro de interceptores donde se anadira el LocaleChangeInterceptor.
	 */
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(localeChangeInterceptor());
	}
}