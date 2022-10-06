package com.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SuppressWarnings("deprecation")
@RestController
@EnableWebSecurity
public class MyController extends WebSecurityConfigurerAdapter{

		
	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		auth.inMemoryAuthentication().withUser("nirmal").password("nirmal").roles("admin").and()
		.withUser("rakesh").password("rakesh").roles("user");
		

		
	}
	
	@Bean
	PasswordEncoder getPasswordEncoder() {
		return NoOpPasswordEncoder.getInstance();


	}
	
	@RequestMapping("/")
	public String index()
	{
		return "<center><h1>Autentication Successfull</h1></center>"
				+ "<br><br><a href=\"logout\">Logout</a> ";
	}
	
	

}

