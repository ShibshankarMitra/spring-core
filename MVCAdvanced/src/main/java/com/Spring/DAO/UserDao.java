package com.Spring.DAO;

import java.io.Serializable;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.Spring.Entity.User;
import com.Spring.Entity.UserDemo;

@Repository("userDao")
public class UserDao {

	@Autowired
	@Qualifier("template")
	private HibernateTemplate template;

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	
	
	//transaction for saving @Entity User
	@Transactional
	public String save(User user) {
		
		Serializable save = this.template.save(user);
		return save.toString();
		
	}
	
	//transaction for saving @Entity UserDemo
	@Transactional
    public String savedemo(UserDemo userDemo) {
		
		Serializable save = this.template.save(userDemo);
		return save.toString();
		
	}
	
}
