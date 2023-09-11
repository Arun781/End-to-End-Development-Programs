package com.wealus.webApp.applicationConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.wealus.webApp")
public class WebAppConfig {
	public WebAppConfig() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	@Bean
	public ViewResolver resolver() {
		System.out.println("Running the in WebAppConfig...");
		return new InternalResourceViewResolver(".", "/");
	}
	@Bean
	public LocalContainerEntityManagerFactoryBean containerEntityManagerFactoryBean() {
		System.out.println("Running the containerEntityManagerFactoryBean in WebAppConfig..");
		return new LocalContainerEntityManagerFactoryBean();
	}
}
