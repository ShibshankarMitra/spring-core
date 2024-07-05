package com.spring.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.spring.Dao.ProductDao;
import com.spring.Entity.Product;

@Service("productAddService")
public class ProductAddService {

	@Autowired
	@Qualifier("productDao")
	private ProductDao productDao;
	
	public String executeSave(Product p) {
		int save = this.productDao.save(p);
			String msg=p.getName()+" was Saved Successfully";
			return msg;
	
		
	}
}
