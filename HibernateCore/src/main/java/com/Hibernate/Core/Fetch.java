package com.Hibernate.Core;

import javax.persistence.EntityManagerFactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Hibernate.Core.Dao.Student;

public class Fetch {

	public static void main(String[] args) {
		System.out.println("App Started");

		Configuration cfg = new Configuration();
		cfg.configure("Hbntconfig.xml");
		System.out.println("getting Session factory");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
	//Getiing objcts load()
		
		//Fires query only when we run getters of the entity columns, or call .size() method
		Student student = (Student)session.load(Student.class, 1004);
		
		//If we dont print the student object hibernate will not fire query. it will store the proxy in student object.Lazy initialization
		//System.out.println(student + "firing query");
		
		System.out.println("Load completed");
		
		
		//Load All call
		EntityManagerFactory emf = session.getEntityManagerFactory();
		System.out.println(emf);
		
		
	//Getiing objcts get()
		
		//Fires query only once and gets the data st, st1 is same as st which is in chache, so it does not fire query again.eager initialization
		
		Student st = (Student)session.get(Student.class, 1005);
		Student st1 = (Student)session.get(Student.class, 1005);
		
		System.out.println(st);
		System.out.println(st1);
		
		
		
		
		
		
		session.close();
	}

}
