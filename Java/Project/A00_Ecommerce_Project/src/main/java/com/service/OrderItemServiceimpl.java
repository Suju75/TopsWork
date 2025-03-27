package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.OrderItems;
import com.repo.OrderItemRepo;

@Service
public class OrderItemServiceimpl implements OderItemService {

	@Autowired
	OrderItemRepo repo;

	@Override
	public void addOrUpdateOrderItem(OrderItems ot) {
		repo.save(ot);

	}

}
