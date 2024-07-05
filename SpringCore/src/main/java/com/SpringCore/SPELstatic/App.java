package com.SpringCore.SPELstatic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		
		ApplicationContext context= new ClassPathXmlApplicationContext("com/SpringCore/SPELstatic/SPELstaticConfig.xml");
		Demo d1=(Demo) context.getBean("d1");
		System.out.println(d1);
	}

}
