
package com.springcore.Lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@SuppressWarnings("unused")
public class Test {

	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/Lifecycle/Lifecycleconfig.xml");
		//AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/Lifecycle/Lifecycleconfig.xml");
//		solve  s1=(solve)context.getBean("s1");
//		System.out.println(s1);
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/Lifecycle/Lifecycleconfig.xml");
		context.registerShutdownHook();
		solve s1=(solve)context.getBean("s1");
		System.out.println(s1);

		System.out.println("++++++++++++++++++++++++++++++");
		
		Pepsi  p1=(Pepsi) context.getBean("p1");
		System.out.println(p1);
		
		
		System.out.println("++++++++++++++++++++++++++++++");
		
		Example  example=(Example) context.getBean("example");
		System.out.println("example");
		
		
	}

}
