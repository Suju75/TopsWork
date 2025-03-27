package com.service;

import java.util.List;

import com.model.Order;
import com.model.User;

public interface OrderService {
   
	public Order addorUpdateOrder(Order o);
	
	public List<Order> findByUser(User user);
	
	public List<Order> getallOrders();
}
