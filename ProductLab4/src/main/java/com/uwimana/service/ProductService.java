package com.uwimana.service;

import java.util.List;

import com.uwimana.domain.Product;

 public interface ProductService   {
	
	public List<Product> getAll();
	
	public void save(Product product);
	
	
		   
}
 
