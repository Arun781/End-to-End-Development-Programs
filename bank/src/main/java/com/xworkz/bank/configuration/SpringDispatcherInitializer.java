package com.xworkz.bank.configuration;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringDispatcherInitializer extends AbstractAnnotationConfigDispatcherServletInitializer
		implements WebMvcConfigurer {

	public SpringDispatcherInitializer() {
		System.out.println("-----Dispatcher Constructor-----");
		}

		@Override
		protected Class<?>[] getRootConfigClasses() {
			System.out.println("------getRootConfigClasses------");
			return new Class[] {MvcConfiguration.class};
		}

		@Override
		protected Class<?>[] getServletConfigClasses() {
			System.out.println("------getServletConfigClasses------");
			return null;
		}

		@Override
		protected String[] getServletMappings() {
			System.out.println("-----getServletMappings-----");
			return new String[] {"/"};		//	/ indicates any url pattern
		}

}
