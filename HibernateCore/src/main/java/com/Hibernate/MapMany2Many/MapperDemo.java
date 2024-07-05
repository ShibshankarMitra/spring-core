package com.Hibernate.MapMany2Many;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapperDemo {

	public static void main(String[] args) {
		System.out.println("App Started");

		Configuration cfg = new Configuration();
		cfg.configure("Hbntconfig.xml");
		System.out.println("getting Session factory");
		SessionFactory factory = cfg.buildSessionFactory();
		
		Employee e1= new Employee();
		e1.setEid(1001);
		e1.setEname("Ram");
		
		Employee e2= new Employee();
		e2.setEid(1002);
		e2.setEname("Shyam");
		
		Employee e3= new Employee();
		e3.setEid(1003);
		e3.setEname("Sundar");
		
		Project p1 =  new Project();
		p1.setPid(2001);
		p1.setPname("Library management");
		
		Project p2 =  new Project();
		p2.setPid(2002);
		p2.setPname("ChatBot");
		
		Project p3= new Project();
		p3.setPid(2003);
		p3.setPname("ECOM Site");
		
		List<Employee> emp1= new ArrayList<Employee>();
		
		
		List<Project> proj1= new ArrayList<Project>();
		List<Project> proj2= new ArrayList<Project>();
		
		proj1.add(p1);
		
		proj2.add(p1);
		proj2.add(p2);
		
		emp1.add(e1);
		emp1.add(e2);
		
		
		e2.setProjects(proj2);
		e1.setProjects(proj1);
		//p1.setEmployees(emp1);
		
		
		
		
		
		Session s = factory.openSession();
		//Session Opened
		
		//Transaction began
		Transaction tx = s.beginTransaction();
		
		s.save(e1);
		s.save(e2);
		s.save(p1);
		s.save(p2);
		
		
		tx.commit();
		
		//Committing
		s.close();
		
		
	}

}
