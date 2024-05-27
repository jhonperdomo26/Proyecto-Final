package com.ironbody.ironbodyweb.config;

import com.ironbody.ironbodyweb.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Configuration
@EnableWebSecurity
@Tag(name = "SecurityConfig", description = "Configuración de seguridad para la aplicación web.")
public class SecurityConfig {

    @Autowired
    @Lazy
    private UsuarioService usuarioService;

    /**
     * Bean para codificar contrasenas usando BCrypt.
     *
     * @return Instancia de BCryptPasswordEncoder.
     */
    @Bean
    @Operation(summary = "Bean para codificar contraseñas usando BCrypt")
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    /**
     * Bean para configurar el proveedor de autenticacion con DAO.
     *
     * @return Instancia de DaoAuthenticationProvider.
     */
    @Bean
    @Operation(summary = "Bean para configurar el proveedor de autenticación con DAO")
    public DaoAuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider auth = new DaoAuthenticationProvider();
        auth.setUserDetailsService(usuarioService);
        auth.setPasswordEncoder(passwordEncoder());
        return auth;
    }

    /**
     * Configura el AuthenticationManagerBuilder con el proveedor de autenticacion.
     *
     * @param auth AuthenticationManagerBuilder a configurar.
     * @throws Exception en caso de error de configuracion.
     */
    @Operation(summary = "Configura el AuthenticationManagerBuilder con el proveedor de autenticación")
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(authenticationProvider());
    }

    /**
     * Configura la cadena de filtros de seguridad.
     *
     * @param http HttpSecurity a configurar.
     * @return SecurityFilterChain configurado.
     * @throws Exception en caso de error de configuracion.
     */
    @Bean
    @Operation(summary = "Configura la cadena de filtros de seguridad")
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
                .authorizeRequests(authorizeRequests ->
                        authorizeRequests
                                .requestMatchers(
                                        HttpMethod.GET, "/adminmenu", "/users", "/edit").hasRole("ADMIN")
                                .requestMatchers(
                                        HttpMethod.GET, "/", "/login", "/registro", "/home", "/inicio", "/clases", "/sobre_nosotros", "/contacto").permitAll()
                                .requestMatchers(
                                        HttpMethod.GET, "/css/**", "/css-bootstrap/**", "/css-común/**", "/js/**", "/js-bootstrap/**", "/multimedia/**").permitAll()
                                .requestMatchers(
                                        HttpMethod.POST, "/registro", "/login").permitAll()
                                .anyRequest().authenticated()
                )
                .formLogin(login -> login
                        .loginPage("/login")
                        .defaultSuccessUrl("/home", true)
                        .permitAll()
                )
                .logout(logout -> logout
                        .logoutUrl("/logout")
                        .logoutSuccessUrl("/login?logout")
                        .invalidateHttpSession(true)
                        .deleteCookies("JSESSIONID")
                        .permitAll()
                )
                .build();
    }
}