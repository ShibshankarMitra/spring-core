package com.Hibernate.HQL;

import java.util.Arrays;
import java.util.List;

import javax.persistence.NamedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.Hibernate.Core.Dao.Student;

public class HQLexample {

	
	public static void main(String[] args) {
		
		System.out.println("App Started");

		Configuration cfg = new Configuration();
		cfg.configure("Hbntconfig.xml");
		System.out.println("getting Session factory");
		SessionFactory factory = cfg.buildSessionFactory();
		Session s = factory.openSession();
		
		//HQL Sysntax, Select
		String query = "from Student as a where a.city =:x and a.name =:y";
		Query q = s.createQuery(query);
		q.setParameter("x", "Chennai");
		q.setParameter("y","Mala");
		
		
		//HQL Syntax Update/Delete
		String deletquery= "delete from Student as s where s.city=: c";
		Query q1= s.createQuery(deletquery);
		q1.setParameter("c", "Howrah");
		
		
		
		//HQL Syntax Join
		String joinquery= "select q.question_id, q.question, a.answer from Question q INNER JOIN q.answers as a";
		Query q2 = s.createQuery(joinquery);
		
		
		Transaction tx=s.beginTransaction();
		
		
		
		
		//Single result  - uniqueResult
		//Multiple result - List
		List<Student> list = q.list();
		for (Student st:list)
		{
			System.out.println(st.getName());
		}
		
		
		//Executing Update/ delete
		int result = q1.executeUpdate();
		System.out.println("Deleted row "+ result);
		
		List<Object[]> list2 = q2.getResultList();
		
		for(Object[] arr:list2)
		{
			System.out.println(Arrays.toString(arr));
		}
		
		//Committing
		tx.commit();
		//Closing Session
		s.close();
		factory.close();
		
	}
}
