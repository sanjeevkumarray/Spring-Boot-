package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
            Student student =con.getBean("student",Student.class);
            System.out.println(student);
            
            System.out.println(student.hashCode());
            
//            Object student2=con.getBean("ob,Student.class");
//            System.out.println(student2.hashCode());
	}

}
