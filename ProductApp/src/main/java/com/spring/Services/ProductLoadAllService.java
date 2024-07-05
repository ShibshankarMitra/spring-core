package com.spring.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.spring.Dao.ProductDao;
import com.spring.Entity.Product;


@Service("productLoadAllService")
public class ProductLoadAllService {

	

	@Autowired
	@Qualifier("productDao")
	private ProductDao productDao;
	
	public List<Product> executeLoadAll(){
		List<Product> products = this.productDao.LoadAll();
		return products;
	}
}
