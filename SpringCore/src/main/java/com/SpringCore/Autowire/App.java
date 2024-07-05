package com.SpringCore.Autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/SpringCore/Autowire/Autowireconfig.xml");
		Emp emp1= (Emp)context.getBean("emp1");
		Emp emp2= (Emp)context.getBean("emp2");
		Emp emp3= (Emp)context.getBean("emp3");
		
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
	}

}
