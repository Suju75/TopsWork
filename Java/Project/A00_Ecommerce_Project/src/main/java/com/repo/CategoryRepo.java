package com.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {
   
	
}
