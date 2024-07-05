package com.spring.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.spring.Dao.ProductDao;
import com.spring.Entity.Product;

@Service("productDeleteService")
public class ProductDeleteService {
	
	@Autowired
	@Qualifier("productDao")
	private ProductDao productDao;
	
	public void executeDelete(int id) {
		this.productDao.delete(id);
		
	}
	

}
