package com.ironbody.ironbodyweb.security;

import com.ironbody.ironbodyweb.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.LogoutConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;


/**
 * Configuración de seguridad para la aplicación Carmen.
 */

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    // Inyección "floja" de usuarioService

    @Autowired
    @Lazy
    private UsuarioService usuarioService;

    // Codificador de contraseñas

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    // Proveedor de autenticación basado en el servicio de usuario

    @Bean
    public DaoAuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider auth = new DaoAuthenticationProvider();
        auth.setUserDetailsService(usuarioService);
        auth.setPasswordEncoder(passwordEncoder());
        return auth;
    }

    // Configuración de autenticación

    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(authenticationProvider());
    }

    // Configuración de filtros, página de login y página de logout

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
                .authorizeRequests(authorizeRequests ->
                        authorizeRequests

                                .requestMatchers(
                                        HttpMethod.GET,"/", "/inicio", "/clases", "/sobre_nosotros", "/contacto", "/login").permitAll()
                                .requestMatchers(
                                        HttpMethod.GET,"/css/**", "/css-bootstrap/**", "/css-común/**", "/js/**", "/js-bootstrap/**", "/multimedia/**").permitAll()
                                .requestMatchers(
                                        HttpMethod.POST, "/registro", "/login").permitAll()

                )
                .formLogin(login -> login
                        .loginPage("/login")
                        .defaultSuccessUrl("/home", true)
                        .permitAll()
                )
                .logout(logout -> logout
                        .logoutUrl("/logout") // Especifica la URL de cierre de sesión
                        .logoutSuccessUrl("/login?logout") // URL a la que redirigir después de cerrar sesión
                        .invalidateHttpSession(true)
                        .deleteCookies("JSESSIONID") // Elimina las cookies de sesión
                        .permitAll()
                )
                .build();
    }
}