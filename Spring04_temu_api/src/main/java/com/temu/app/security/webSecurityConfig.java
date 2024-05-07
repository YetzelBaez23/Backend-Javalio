/*

package com.temu.app.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;
@Configuration
@EnableWebSecurity
public class webSecurityConfig {
	
	/*
	// STEP 1  Autenticación basada en usuarios en memoria
	@Bean
	UserDetailsService userDetailsService() {
		UserDetails sergio = User.builder()
					.username("sergio")
					.password("{noop}123")
					.roles("ADMIN")
					.build();
		
		UserDetails tania = User.builder()
				.username("tania")
				.password("{noop}456")
				.roles("CUSTOMER")
				.build();
		
		UserDetails kristian = User.builder()
				.username("tania")
				.password("{noop}789")
				.roles("WAREHOUSE")
				.build();
		
		return new InMemoryUserDetailsManager(sergio, tania, kristian);
	}
	
	*/
	
	/*
	// STEP 1.1  Crear un bean de passwordEncoder// Se utiliza para codificar y 
	//verificar contraseña con el algoritmo Bcrypt
	@Bean 
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	*/

/*
	public static void main(String[] args) {
		System.out.println(new BCryptPasswordEncoder().encode("123"));
	}
	
	// STEP" Realizar configuración personalizadas del filter chain
	@Bean
	SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		
		// Step 2.1 Deshabilitar la seguridad
		/*return http
				.authorizeHttpRequests(authorize -> authorize.anyRequest().permitAll())
				.csrf(csrf-> csrf.disable())
				.httpBasic(withDefaults())
				.build();
				
			*/
		// Step 2.1 Personalizar seguridad de endpoints
		/*	return http
					.authorizeHttpRequests(authorize -> authorize
							.requestMatchers("/", "index.html","/assets/**").permitAll()
							.requestMatchers(HttpMethod.POST, "/api/v1/users").permitAll()//Para que un usuario pueda registrarse
							.requestMatchers(HttpMethod.GET, "/api/v1/posts", "/api/v1/posts/**").permitAll()// Para que uno pueda visualizar los productos
							.requestMatchers("/api/v1/roles/**").hasRole("ADMIN")
							.requestMatchers("/api/v1/users/**",
											 "/api/v1/purchases/**",
											 "/api/v1/purchase-has-post/**"
											 ).hasAnyRole("ADMIN","CUSTOMER")
							.anyRequest().authenticated()
							)
					.csrf(csrf-> csrf.disable())
					.httpBasic(withDefaults())
					.build();
				
	}
	
	
	// STEP 3 Autenticación basada en usuario de la DB
	AuthenticationManager authManager(HttpSecurity httpSecurity,
									 PasswordEncoder passwordEncoder,
									 UserDetailsService userDetailsService						
									) throws Exception{
		AuthenticationManagerBuilder  authManagerBuilder = httpSecurity
				.getSharedObject(AuthenticationManagerBuilder.class);
		
		authManagerBuilder
		.userDetailsService(userDetailsService)
		.passwordEncoder(passwordEncoder);
		
		return authManagerBuilder.build();
		
	}
	
	
	

}

*/
