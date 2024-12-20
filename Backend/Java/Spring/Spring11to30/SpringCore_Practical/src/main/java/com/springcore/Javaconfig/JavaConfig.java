package com.springcore.Javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.springcore.Javaconfig")
public class JavaConfig {
	
	/* @Bean(name = {"student","friends"}) */
	@Bean
	public Student getStudent() {
		Student student = new Student();
		return student;
	}
}
