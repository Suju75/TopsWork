package com.service;

import java.util.List;

import com.model.Cart;
import com.model.User;

public interface CartService {

	public void addOrUpdateCart(Cart cart);

	public List<Cart> allCartItems();

	public void deleteById(int id);

	public Cart cartBYId(int id);

	public List<Cart> findByUser(User user);

	public void deleteByUser(User user);
	
	public long count();
}
