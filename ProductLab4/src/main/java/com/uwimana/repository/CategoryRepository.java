package com.uwimana.repository;

import java.util.List;

import com.uwimana.domain.Category;

 public interface CategoryRepository   {

		public Category getCategory(int id);
		
		public List<Category> getAll();
		   
	
}
 
