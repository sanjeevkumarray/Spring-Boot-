package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SuppressWarnings("unused")
public class DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		ApplicationContext context= new  AnnotationConfigApplicationContext(JavaConfig.class);
		Student st =context.getBean("firststudent",Student.class);
		
		System.out.println(st);
		st.study();
	}

}
