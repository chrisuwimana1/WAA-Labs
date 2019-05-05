package com.uwimana.service.impl;

import java.util.List;

import com.uwimana.domain.Product;
import com.uwimana.repository.ProductRepository;
import com.uwimana.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductRepository productRepository;
	
	public List<Product> getAll() {
		return productRepository.getAll();
	}
	
	public void save(Product product) {
		productRepository.save(product);
		return ;
	}
	
	
		   
}
 
