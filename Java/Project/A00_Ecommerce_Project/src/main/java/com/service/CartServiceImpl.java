package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.model.Cart;
import com.model.User;
import com.repo.CartRepo;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	CartRepo repo;

	@Override
	public void addOrUpdateCart(Cart cart) {
		repo.save(cart);

	}

	@Override
	public List<Cart> allCartItems() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void deleteById(int id) {
		repo.deleteById(id);

	}

	@Override
	public Cart cartBYId(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElseThrow();
	}

	@Override
	public List<Cart> findByUser(User user) {
		// TODO Auto-generated method stub
		return repo.findByUser(user);
	}

	@Transactional
	@Override
	public void deleteByUser(User user) {
		repo.deleteByUser(user);

	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return repo.count();
	}

}
