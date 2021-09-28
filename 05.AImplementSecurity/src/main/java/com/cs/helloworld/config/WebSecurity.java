package com.cs.helloworld.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

@EnableWebSecurity
public class WebSecurity extends WebSecurityConfigurerAdapter{
	protected void configure(HttpSecurity httpSecurity) throws Exception{
		httpSecurity
		.authorizeRequests()
		.antMatchers("/hello").hasRole("USER")
		.antMatchers("/emps").hasRole("ADMIN")
		.anyRequest().authenticated()
		.and()
		.httpBasic();
		//httpSecurity.csrf().disable();
	}
	
	@Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth
            .inMemoryAuthentication()
                .withUser("user").password("{noop}user").roles("USER");
        auth
        .inMemoryAuthentication()
            .withUser("admin").password("{noop}admin").roles("USER","ADMIN");
    }
}
