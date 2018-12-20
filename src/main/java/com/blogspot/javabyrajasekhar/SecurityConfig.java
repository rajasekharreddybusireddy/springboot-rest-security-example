package com.blogspot.javabyrajasekhar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	@Autowired
	protected void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
	auth.inMemoryAuthentication()
	.withUser("user").password("{noop}password").roles("USER").and()
    .withUser("admin").password("{noop}password").roles("ADMIN");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		  http
          .antMatcher("/**")                               
          .authorizeRequests()
              .anyRequest().hasRole("ADMIN")
              .and()
          .httpBasic();
	
	}
}
