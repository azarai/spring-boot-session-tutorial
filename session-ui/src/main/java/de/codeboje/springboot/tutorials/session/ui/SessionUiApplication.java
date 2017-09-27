package de.codeboje.springboot.tutorials.session.ui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class SessionUiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SessionUiApplication.class, args);
	}
}
