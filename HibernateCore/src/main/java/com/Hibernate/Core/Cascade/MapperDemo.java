package com.Hibernate.Core.Cascade;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Hibernate.Map.Answer;
import com.Hibernate.Map.Question;

public class MapperDemo {

	public static void main(String[] args) {

		System.out.println("App Started");

		Configuration cfg = new Configuration();
		cfg.configure("Hbntconfig.xml");
		System.out.println("getting Session factory");
		SessionFactory factory = cfg.buildSessionFactory();

		Question q1 = new Question();

		q1.setQuestion_id(1003);
		q1.setQuestion("What is Web?");

		Answer a1 = new Answer();
		a1.setAnswer_id(20010);
		a1.setAnswer("Web is a WWW");

		Answer a2 = new Answer();
		a2.setAnswer_id(20011);
		a2.setAnswer("web uses Inernet");

		

		List<Answer> ans = new ArrayList<Answer>();

		ans.add(a1);
		ans.add(a2);
		

		q1.setAnswers(ans);

		a1.setQuestion(q1);
		a2.setQuestion(q1);
		

		Session s = factory.openSession();
		
		
		
		// Saving data
		Transaction tx = s.beginTransaction();
		
		
		//Only saving q1 will automatically save a1 and a2 in the answer entity
		s.save(q1);

		
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
