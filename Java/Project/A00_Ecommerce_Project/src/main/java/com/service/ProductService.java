package com.service;

import java.util.List;

import com.model.Category;
import com.model.Product;

public interface ProductService {

	public void addOrUpdateProduct(Product product);

	public List<Product> allProducts();

	public Product productById(int id);

	public void deleteById(int id);

	public List<Product> findByCategory(Category category);
	
	public List<Product> findByProductName(String productName);

}
