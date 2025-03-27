package com.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Order;
import com.model.User;

import java.util.List;


public interface OrderRepo extends JpaRepository<Order, Integer> {
	
	public List<Order> findByUser(User user);
	

}
