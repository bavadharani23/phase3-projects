package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com")
public class SpringSecuritywithAuthenticationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecuritywithAuthenticationApplication.class, args);
	}

}
