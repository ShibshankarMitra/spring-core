package com.Spring.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.Spring.DAO.UserDao;
import com.Spring.Entity.User;
import com.Spring.Entity.UserDemo;

@Service("userService")
public class UserService {

	@Autowired
	@Qualifier("userDao")
	private UserDao userDao;
	
	
	//Service for @Entity User
	public String executeSave(User user) {
		return this.userDao.save(user);
	}

	//Service for @Entity UserDemo
	public String executeSaveDemo(UserDemo userDemo) {
		
		return this.userDao.savedemo(userDemo);
	}
	
	
}
