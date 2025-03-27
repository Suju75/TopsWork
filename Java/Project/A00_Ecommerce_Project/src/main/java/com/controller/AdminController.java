package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.service.OrderService;

@Controller

public class AdminController {

	@Autowired
	OrderService service;

	@GetMapping("/admin")
	public String adminLogin() {
		return "adminLogin";

	}

	@GetMapping("/dashboard")
	public String adminDashboard() {
		return "adminDashboard";

	}

	@GetMapping("/order")
	public String Order(Model model) {
		model.addAttribute("orders", service.getallOrders());
		return "order";

	}

	@PostMapping("/adminLogin")
	public String processAdminLogin(@RequestParam String username, @RequestParam String password) {
		if ("admin@gmail.com".equals(username) && "admin123".equals(password)) {
			return "redirect:/dashboard";
		}
		return "redirect:/admin";
	}

}
