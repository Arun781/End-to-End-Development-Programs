package com.xworkz.user.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.user")
public class LoginConfiguration {
	public LoginConfiguration() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Bean
	public ViewResolver viewResolver() {
		System.out.println("Running the viewResolver in LoginConfiguration...");
		return new InternalResourceViewResolver("/", ".jsp");
	}
	
	@Bean
	public LocalContainerEntityManagerFactoryBean containerEntityManagerFactoryBean() {
		System.out.println("Running the LocalContainerEntityManagerFactoryBean in LoginConfiguration...");
		return new LocalContainerEntityManagerFactoryBean();
	}
}
