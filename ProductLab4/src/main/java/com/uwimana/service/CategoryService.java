package com.uwimana.service;

import java.util.List;

import com.uwimana.domain.Category;
import com.uwimana.domain.Product;

 public interface CategoryService  {	
		public Category getCategory(int id);	
		public List<Category> getAll();	
}
 
