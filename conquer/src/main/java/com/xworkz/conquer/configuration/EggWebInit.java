package com.xworkz.conquer.configuration;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.xworkz.killer.configuration.EggApplicationInit;

public class EggWebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {
	public EggWebInit() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Created "+this.getServletName());
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Running the getServletConfigClasses");
		return new Class[] {EggApplicationInit.class};
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return null;
	}

}
