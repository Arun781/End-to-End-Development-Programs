package com.xworkz.valatine.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.valatine")
public class ValentinConfiguration {
	public ValentinConfiguration() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	
	@Bean
	public ViewResolver viewResolver() {
		System.out.println("Running the viewResolver....");
		return new InternalResourceViewResolver("/",".jsp");
	}
	@Bean
	public LocalContainerEntityManagerFactoryBean containerEntityManagerFactoryBean() {
		System.out.println("Running the LocalContainerEntityManagerFactoryBean");
		return new LocalContainerEntityManagerFactoryBean();
	}
}
