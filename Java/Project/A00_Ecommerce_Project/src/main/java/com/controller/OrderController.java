package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.emailsending.EmailSending;
import com.model.Cart;
import com.model.Order;
import com.model.OrderItems;
import com.model.Product;
import com.model.User;
import com.service.CartService;
import com.service.OderItemService;
import com.service.OrderService;
import com.service.ProductService;
import com.service.UserService;

import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
public class OrderController {

	@Autowired
	UserService service;

	@Autowired
	OrderService orderService;

	@Autowired
	CartService cartService;

	@Autowired
	ProductService productService;

	@Autowired
	OderItemService itemService;

	@GetMapping("/addorder")
	public String addOrder(@RequestParam("oid") String id, HttpServletResponse resp, HttpSession session)
			throws IOException {

		User u = (User) session.getAttribute("user");
		PrintWriter writer = resp.getWriter();
		Order order = new Order();
		order.setPaymentType(id);
		order.setOrderDate(new Date().toString());
		order.setUser(service.getUserById(u.getId()));
		Order o = orderService.addorUpdateOrder(order);

		System.out.println(o);

		List<Cart> byUser = cartService.findByUser(u);

		for (Cart c : byUser) {
			OrderItems items = new OrderItems();
			items.setOrder(o);
			items.setProduct(c.getProduct());
			items.setPrice(c.getProduct().getProductPrice());
			items.setQty(c.getQty());
			itemService.addOrUpdateOrderItem(items);
		}

		cartService.deleteByUser(service.getUserById(u.getId()));

		EmailSending.send(u.getEmail(), id, "Order Confirmed");

		writer.append("Order Successfully ");
		return "";

	}
}
