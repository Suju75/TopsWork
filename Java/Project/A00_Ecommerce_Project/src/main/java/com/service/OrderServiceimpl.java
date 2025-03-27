package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Order;
import com.model.User;
import com.repo.OrderRepo;

@Service
public class OrderServiceimpl implements OrderService {

	@Autowired
	OrderRepo repo;

	@Override
	public Order addorUpdateOrder(Order o) {
		// TODO Auto-generated method stub
		return repo.save(o);
	}

	@Override
	public List<Order> findByUser(User user) {
		// TODO Auto-generated method stub
		return repo.findByUser(user);
	}

	@Override
	public List<Order> getallOrders() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
