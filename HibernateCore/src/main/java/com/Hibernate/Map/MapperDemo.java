package com.Hibernate.Map;

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

		Question q1 = new Question();

		q1.setQuestion_id(1001);
		q1.setQuestion("What is java?");

		Answer a1 = new Answer();
		a1.setAnswer_id(2001);
		a1.setAnswer("Java is a language");

		Answer a2 = new Answer();
		a2.setAnswer_id(2002);
		a2.setAnswer("With the help of java you can develop Softwares");

		Answer a3 = new Answer();
		a3.setAnswer_id(2003);
		a3.setAnswer("Java is a object oriented PL");

		List<Answer> ans = new ArrayList<Answer>();

		ans.add(a1);
		ans.add(a2);
		ans.add(a3);

		q1.setAnswers(ans);

		a1.setQuestion(q1);
		a2.setQuestion(q1);
		a3.setQuestion(q1);

		Session s = factory.openSession();
		
		
		
		// Saving data
		Transaction tx = s.beginTransaction();
		s.save(q1);

		s.save(a1);
		s.save(a2);
		s.save(a3);

		tx.commit();

		// Fetching data
		
		
		Question q= s.get(Question.class, 1001);
		
		System.out.println(q.getQuestion());
		
		
		//Lazy calling size
		System.out.println(q.getAnswers().size());
		
//		for(Answer a: q.getAnswers())
//		{
//			System.out.println(a.getAnswer());
//		}
//		

		s.close();
	}

}
