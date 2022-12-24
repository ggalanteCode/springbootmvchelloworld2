package com.soprasteria.springbootmvchelloworld2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages = "com.soprasteria.springbootmvchelloworld2")
public class Springbootmvchelloworld2Application extends SpringBootServletInitializer {
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		return builder.sources(Springbootmvchelloworld2Application.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(Springbootmvchelloworld2Application.class, args);
	}

}
