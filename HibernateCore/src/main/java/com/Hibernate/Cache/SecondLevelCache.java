package com.Hibernate.Cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

import com.Hibernate.Core.Dao.Student;



public class SecondLevelCache {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		SessionFactory factory = new Configuration().configure("Hbntconfig.xml").buildSessionFactory();
		Session session1 = factory.openSession();
		//Inside First Level cache. Ends after session1.close()
		Student student1 = session1.get(Student.class, 1008);
		System.out.println(student1);
		session1.close();
		//first level cache is now ended
		
		
		
    	//Creating new session from same factory object. 2nd level caching holds
		Session session2 = factory.openSession();
		//We are fetching same object with id= 1008. If 2nd Level ache is enabled then query will not fire for session2 object
	    Student student2 = session2.get(Student.class, 1008);
		System.out.println(student2);
		session2.close();
		
		
	}

}
