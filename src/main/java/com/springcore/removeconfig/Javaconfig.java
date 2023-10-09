package com.springcore.removeconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.springcore.removeconfig")
public class Javaconfig {
	
	@Bean
	public  Solution getSolution() {
		return new Solution();
	}
	
	@Bean
	public  Student getStudent() {
		Student student = new Student(getSolution());
		return student;

}

}