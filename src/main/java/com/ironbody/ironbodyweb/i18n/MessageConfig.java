package com.ironbody.ironbodyweb.i18n;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

/**
 * Configuracion para la fuente de mensajes de internacionalizacion.
 */
@Configuration
public class MessageConfig {

    /**
     * Define el MessageSource para cargar los mensajes de internacionalizacion desde un archivo de recursos.
     *
     * @return una instancia de ReloadableResourceBundleMessageSource configurada con la ruta y codificacion de los mensajes.
     */
    @Bean
    public MessageSource messageSource() {
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasename("classpath:messages");
        messageSource.setDefaultEncoding("UTF-8");
        return messageSource;
    }

}