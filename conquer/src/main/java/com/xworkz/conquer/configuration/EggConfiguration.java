package com.xworkz.conquer.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.conquer")
public class EggConfiguration {
	public EggConfiguration() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
}
