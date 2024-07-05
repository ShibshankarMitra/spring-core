package com.SpringCore.Stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
	
		ApplicationContext context = new ClassPathXmlApplicationContext("com/SpringCore/Stereotype/StereoConfig.xml");
		Student student= context.getBean("obj", Student.class);
		System.out.println(student);
		System.out.println(student.getPhones());
		System.out.println(student.getPhones().getClass());
		
		
	}

}
