package com.springcore.removeconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@SuppressWarnings("unused")
public class Test {
	

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext con = new AnnotationConfigApplicationContext(Javaconfig.class);
        Student student  =con.getBean("getStudent",Student.class);
        System.out.println(student);
        student.study();
	}

}
