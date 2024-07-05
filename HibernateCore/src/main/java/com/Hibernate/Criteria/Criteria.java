package com.Hibernate.Criteria;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.Hibernate.Core.Dao.Student;

public class Criteria {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("Hbntconfig.xml").buildSessionFactory();
		
		
		
		
		
		Session session = factory.openSession();
		
		org.hibernate.Criteria c =  session.createCriteria(Student.class);
		
    	c.add(Restrictions.eq("cert.course", "Hibernate"));
		List<Student> list = c.list();
		//We can use c.uniqueResult() to get unique Entity as result
		for (Student s: list)
		{
			System.out.println(s);
		}
		
		
//		Transaction tx = session.beginTransaction();
//		
//		
//		tx.commit();
		session.close();
		factory.close();

	}

}
