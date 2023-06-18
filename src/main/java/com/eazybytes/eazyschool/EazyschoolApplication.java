package com.eazybytes.eazyschool;

import java.util.Arrays;

import javax.faces.webapp.FacesServlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import jakarta.servlet.ServletContext;

@SpringBootApplication
@EntityScan("com.eazybytes.eazyschool.model")
@EnableJpaRepositories("com.eazybytes.eazyschool.repository")
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
public class EazyschoolApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(EazyschoolApplication.class, args);
	}
	
}
