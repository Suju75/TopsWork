package com.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.model.User;

public interface UserRepo extends JpaRepository<User, Integer> {

	/*
	 * @Query("select u from User as u where u.email=:email and u.password=:pass")
	 * public User findByEmailAndPassword(@Param("email") String
	 * email,@Param("pass")String password);
	 */
	
	public User findByEmailAndPassword(String email,String password);

}
