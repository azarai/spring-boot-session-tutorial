package de.codeboje.springboot.tutorials.session.api;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.session.web.http.HeaderHttpSessionStrategy;
import org.springframework.session.web.http.HttpSessionStrategy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableWebSecurity
@RestController
public class SessionApiApplication {

	@GetMapping("/name")
	public String getName(Principal principal) {
		return principal.getName();
	}
	
	@Bean
	public HttpSessionStrategy httpSessionStrategy() {
		return new HeaderHttpSessionStrategy(); 
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SessionApiApplication.class, args);
	}
}
