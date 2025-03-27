package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Category;
import com.repo.CategoryRepo;

@Service
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	CategoryRepo repo;

	@Override
	public void addOrUpdateCategory(Category category) {

		repo.save(category);

	}

	@Override
	public List<Category> allCategory() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Category categoryById(int id) {

		return repo.findById(id).orElseThrow();
	}

	@Override
	public void categoryDeleteById(int id) {
		repo.deleteById(id);

	}

}
