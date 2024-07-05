package com.SpringCore.Ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("com/SpringCore/Ref/RefConfig.xml");
		A a1= (A)context.getBean("a1");
		System.out.println(a1.getX());
		System.out.println(a1.getObj().getY());
	}

}
