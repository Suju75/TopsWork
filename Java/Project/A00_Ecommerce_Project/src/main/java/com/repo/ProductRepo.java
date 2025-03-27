package com.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Category;
import com.model.Product;
import java.util.List;


public interface ProductRepo extends JpaRepository<Product, Integer> {
   
	public List<Product> findByCategory(Category category);
	
	public List<Product> findByProductName(String productName);
}
