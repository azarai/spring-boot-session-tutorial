package de.codeboje.springboot.tutorials.session.ui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.session.web.http.CookieHttpSessionIdResolver;
import org.springframework.session.web.http.CookieSerializer;
import org.springframework.session.web.http.DefaultCookieSerializer;
import org.springframework.session.web.http.HeaderHttpSessionIdResolver;
import org.springframework.session.web.http.HttpSessionIdResolver;

@SpringBootApplication
@EnableWebSecurity
public class SessionUiApplication {

	
	// disable base64 encoding of the sessionId in the cookie for demostration
//	@Bean
//	public HttpSessionIdResolver httpSessionIdResolver() {
//		CookieHttpSessionIdResolver resolver = new CookieHttpSessionIdResolver();
//		DefaultCookieSerializer cookieSerializer = new DefaultCookieSerializer();
//		cookieSerializer.setUseBase64Encoding(false);
//		resolver.setCookieSerializer(cookieSerializer);
//	    return resolver; 
//	}
	
	public static void main(String[] args) {
		SpringApplication.run(SessionUiApplication.class, args);
	}
}
