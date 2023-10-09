package com.springcore.ConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ConstructorInjection/ConstructorInjectionconfig.xml");
		  
		Person  p=(Person)context.getBean("person");
		System.out.println(p);
		
		Addition add=(Addition) context.getBean("add");
		add.dosum();

	}

}
