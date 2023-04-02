package com.xworkz.mail.applicationConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

public class MailConfiguration {
	public MailConfiguration() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Autowired
	private ViewResolver resolver() {
		System.out.println("Running the viewResolver.....");
		return new InternalResourceViewResolver(".jsp", "/");
	}

	@Autowired
	private LocalContainerEntityManagerFactoryBean bean() {
		System.out.println("Running the LocalContainerEntityManagerFactoryBean");
		return new LocalContainerEntityManagerFactoryBean();
	}
}
