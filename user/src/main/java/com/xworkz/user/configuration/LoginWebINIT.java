package com.xworkz.user.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class LoginWebINIT extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {
	public LoginWebINIT() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Running the getRootConfigClasses in LoginWebINIT.......");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Running the getServletConfigClasses in LoginWebINIT.......");
		return new Class[] { LoginConfiguration.class };
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Running the getServletMappings in LoginWebINIT.......");
		return new String[] { "/" };

	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("Running the configureDefaultServletHandling in LoginWebINIT.......");
		configurer.enable();
	}

}
