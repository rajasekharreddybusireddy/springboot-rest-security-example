package com.blogspot.javabyrajasekhar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
@ComponentScan(basePackageClasses=SecurityConfig.class)
public class SpringbootRestSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRestSecurityApplication.class, args);
	}

}

