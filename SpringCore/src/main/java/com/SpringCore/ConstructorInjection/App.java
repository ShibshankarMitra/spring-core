package com.SpringCore.ConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringCore.Ref.A;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/SpringCore/ConstructorInjection/ConstructorConfig.xml");
		/*
		 * Person person1= (Person)context.getBean("person1");
		 * System.out.println(person1);
		 */
		
		Addition addint= (Addition)context.getBean("addint");
		Addition adddouble= (Addition)context.getBean("adddouble");
		
		
		System.out.println(addint);
		addint.doSum();
		
		
		System.out.println(adddouble);
		adddouble.doSum();
		
	}

}
