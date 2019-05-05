package com.uwimana.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uwimana.domain.Category;
import com.uwimana.repository.CategoryRepository;
import com.uwimana.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	CategoryRepository categoryRepository;
	
	@Override
  	public List<Category> getAll() {
		return categoryRepository.getAll();
	}

	@Override
	public Category getCategory(int id) {
		return categoryRepository.getCategory(id);
 	}
	
	
		   
}
 
