package com.Hibernate.Core;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Hibernate.Core.Dao.Certificate;
import com.Hibernate.Core.Dao.Student;

public class Embed {

	public static void main(String[] args) {
System.out.println( "App Started" );
        
        Configuration cfg =  new Configuration();
        cfg .configure("Hbntconfig.xml");
        System.out.println("getting Session factory");
		SessionFactory factory= cfg.buildSessionFactory();
        
		
		
		Student st= new Student();
		st.setId(1004);
		st.setCity("Trichi");
		st.setName("Monika");
		
		
		Student st1= new Student();
		st1.setId(1005);
		st1.setCity("Chennai");
		st1.setName("Mala");
		
		Student st2= new Student();
		st2.setId(1008);
		st2.setCity("TNagar");
		st2.setName("Rachel");
		
		
		Student st3= new Student();
		st3.setId(1007);
		st3.setCity("Howrah");
		st3.setName("Janeth");
		
		Certificate cert = new Certificate("Android", "1 year");
		Certificate cert1 = new Certificate("Hibernate", "2 year");
		Certificate cert3 = new Certificate("Oracle", "3 year");
		Certificate cert4 = new Certificate("Springboot", "1.5 year");
		
		st.setCert(cert);
		st1.setCert(cert1);
		st2.setCert(cert3);
		st3.setCert(cert4);
		
		Session session = factory.openSession();
		
		Transaction tx=session.beginTransaction();
		
		session.save(st);
		session.save(st1);
		session.save(st2);
		session.save(st3);
		
		
		tx.commit();
		session.close();
		factory.close();

	}

}
