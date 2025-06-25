package br.edu.atitus.api_sample.configs;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import br.edu.atitus.api_sample.components.AuthTokenFilter;

@Configuration
public class ConfigSecurity {

	@Bean
	SecurityFilterChain getSecurity(HttpSecurity http, AuthTokenFilter filter) throws Exception {
		http.csrf(csrf -> csrf.disable())
			.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
			.cors(cors -> cors.configurationSource(getCorsConfiguration())) // aqui o spring security vai gerenciar o cors
			.authorizeHttpRequests(auth -> auth
					//.requestMatchers(HttpMethod.OPTIONS).permitAll() /// só usa se for usar o WebMvcConfigurer (ou seja, o spring mvc gerencia o cors)
					.requestMatchers("/ws**", "/ws/**").authenticated()
					.anyRequest().permitAll())
			.addFilterBefore(filter, UsernamePasswordAuthenticationFilter.class);
			
		return http.build();
	}
	
	@Bean // aqui o spring security vai gerenciar o cors
	CorsConfigurationSource getCorsConfiguration() {
		CorsConfiguration configuration = new CorsConfiguration();
		configuration.setAllowedOrigins(List.of("*")); // Use "*" for all origins or specify allowed origins
		configuration.setAllowedMethods(List.of("GET", "POST", "PUT", "DELETE", "OPTIONS"));
		configuration.setAllowedHeaders(List.of("*")); // Allow all headers
		//configuration.setAllowCredentials(true);
			//NÃO É PERMITIDO ESSA CONFIGURAÇÃO SE setAllowedOrigins for Wildcard (*)... 
			//O navegador vai funcionar desde que você NÃO use credentials: 'include' no fetch.
			//Authorization ainda pode ser enviado, desde que seja permitido via CORS e sem credentials: 'include'.
			//Cookies e headers como Authorization, em alguns cenários, serão bloqueados se você usar credentials: 'include' ou same-origin.

		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration("/**", configuration);
		return source;
		
	}
	
//	@Bean
//	WebMvcConfigurer corsConfigurer() {
//		return new WebMvcConfigurer() {
//			@Override
//			public void addCorsMappings(CorsRegistry registry) {
//				registry.addMapping("/**")
//				.allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
//				.allowedOrigins("*");
//			}
//		};
//	}
	
	@Bean
	PasswordEncoder getPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	
	
}
