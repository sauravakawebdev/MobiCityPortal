package com.practice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.entity.Categories;
import com.practice.repositry.CategoriesRepositry;
import com.practice.services.CategoriesService;

@Service("categoriesServive")
public class CategoriesServiceImpl implements CategoriesService{

	@Autowired
	private CategoriesRepositry categoriesRepositry;
	
	
	@Override
	public Iterable<Categories> findAll() {
		// TODO Auto-generated method stub
		return categoriesRepositry.findAll() ;
	}

}
