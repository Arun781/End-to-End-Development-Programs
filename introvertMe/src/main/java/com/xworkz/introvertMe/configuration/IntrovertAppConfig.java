package com.xworkz.introvertMe.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.introvertMe")
public class IntrovertAppConfig {
	public IntrovertAppConfig() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	@Bean
	public ViewResolver resolver() {
		System.out.println("Running the resolver...");
		return new InternalResourceViewResolver("/","/jsp");
	}
	@Bean
	public LocalContainerEntityManagerFactoryBean bean() {
		System.out.println("Running the LocalContainerEntityManagerFactoryBean");
		return new LocalContainerEntityManagerFactoryBean();
	}
}
