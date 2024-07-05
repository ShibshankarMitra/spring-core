package com.Hibernate.Core;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Hibernate.Core.Dao.Address;
import com.Hibernate.Core.Dao.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )throws IOException
    {
        System.out.println( "App Started" );
        
		SessionFactory factory= new Configuration().configure("Hbntconfig.xml").buildSessionFactory();
        
		
		//creating object of student
        Student st= new Student(1001, "Shibu", "Delhi");
        Student st1= new Student(1002, "Ankit", "Lukhonw");
        Student st2= new Student(1003, "Amal", "Varansi");
        
        
        //creating object of Address
        
        Address add =  new Address();
        add.setCity("bangalore");
        add.setStreet("Lm Street");
        add.setOpen(false);
        add.setAddDate(new java.util.Date(0));
        add.setX(123.235);
        
        //Image reading
        @SuppressWarnings("resource")
		FileInputStream fis= new FileInputStream("src/main/java/com/Hibernate/Core/pic.jpg");
        byte [] data =  new byte[fis.available()];
        fis.read(data);
        
        add.setImage(data);
        System.out.println("Setting Data");
        
        Session session= factory.getCurrentSession();
        
        Transaction tx = session.beginTransaction();
        
        
//        session.save(st);session.save(st1);session.save(st2);
        session.save(add);
        
        tx.commit();
        
        session.close();
        
        
        System.out.println("Done!!");
    }
}
