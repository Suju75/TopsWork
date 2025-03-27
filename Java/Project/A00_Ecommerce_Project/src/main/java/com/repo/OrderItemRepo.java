package com.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.OrderItems;

public interface OrderItemRepo extends JpaRepository<OrderItems, Integer> {

}
