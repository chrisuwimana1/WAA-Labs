package com.uwimana.repository;

import com.uwimana.domain.Product;

import java.util.List;

 public interface ProductRepository   {
	
 
	
	public List<Product> getAll();
	
	public void save(Product product);
	
}
 
