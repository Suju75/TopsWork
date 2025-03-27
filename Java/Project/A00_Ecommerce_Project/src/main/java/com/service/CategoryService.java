package com.service;

import java.util.List;

import com.model.Category;

public interface CategoryService {

	public void addOrUpdateCategory(Category category);

	public List<Category> allCategory();

	public Category categoryById(int id);

	public void categoryDeleteById(int id);

}
