package com.wealus.webApp.applicationConfig;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInIt extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {
	public WebAppInIt() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Runninv the getRootConfigClasses......");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Runninv the getServletConfigClasses......");
		return new Class[] { WebAppConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Runninv the getServletMappings......");
		return new String[] { "/" };
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("Runninv the configureDefaultServletHandling......");
		configurer.enable();
	}

}
