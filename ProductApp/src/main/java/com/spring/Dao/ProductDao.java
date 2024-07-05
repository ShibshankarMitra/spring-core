package com.spring.Dao;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.spring.Entity.Product;


@Repository("productDao")
public class ProductDao {

	@Autowired
	private HibernateTemplate template;
	
	
	//For Saving
	@Transactional
	public int save(Product product) {
		int  result = (int) this.template.save(product);
		System.out.println(result);
		return result;
		
	}
	
	//For Deleting
	@Transactional
	public void delete(int id) {
		Product product = template.get(Product.class,id);
		this.template.delete(product);
		System.out.println("delete Completed");
	}
	
	//For Loading All products
	public List<Product> LoadAll(){
		List<Product> products = this.template.loadAll(Product.class);
		return products;
	}
	
}
