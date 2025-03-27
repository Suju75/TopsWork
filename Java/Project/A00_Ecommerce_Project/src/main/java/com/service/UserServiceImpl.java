package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.User;
import com.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepo repo;

	@Override
	public void addOrUpdateUser(User user) {
		// TODO Auto-generated method stub
		repo.save(user);

	}

	@Override
	public List<User> allUsers() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElseThrow();
	}

	@Override
	public void deleteUserById(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);

	}

	@Override
	public User findByEmail(String email,String password) {
		// TODO Auto-generated method stub
		return repo.findByEmailAndPassword(email,password);
	}

}
