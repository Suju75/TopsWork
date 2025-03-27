package com.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.model.Cart;
import com.model.User;

public interface CartRepo extends JpaRepository<Cart, Integer> {

	public List<Cart> findByUser(User user);

	@Modifying
	@Transactional
	@Query("DELETE FROM Cart c WHERE c.user = :user")
	public void deleteByUser(User user);

	@Query("select count(*) from Cart ")
	public long count();
}
