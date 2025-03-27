package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.Cart;
import com.model.Category;
import com.model.Order;
import com.model.Product;
import com.model.User;
import com.service.CartService;
import com.service.CategoryService;
import com.service.OrderService;
import com.service.ProductService;
import com.service.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {

	@Autowired
	CategoryService service;

	@Autowired
	ProductService productService;

	@Autowired
	UserService userService;

	@Autowired
	CartService cartService;

	@Autowired
	OrderService orderService;

	@GetMapping("/")
	public String index(Model model) {

		model.addAttribute("products", productService.allProducts());
		return "index";

	}

	@GetMapping("/shop")
	public String shop(Model model) {
		model.addAttribute("allCategory", service.allCategory());
		model.addAttribute("products", productService.allProducts());
		return "shop";

	}

	@GetMapping("/search")
	public String SearchCategory(@RequestParam("cid") int id, Model model) {

		Category cat = service.categoryById(id);
		model.addAttribute("allCategory", service.allCategory());
		model.addAttribute("products", productService.findByCategory(cat));

		return "shop";

	}

	@GetMapping("/productDetails")
	public String product_details(@RequestParam("id") int pid, Model model) {
		Product productById = productService.productById(pid);

		System.out.println(productById);
		List<Product> list = new ArrayList<>();
		list.add(productById);
		model.addAttribute("productbyid", list);
		return "product_details";

	}

	@GetMapping("/checkout")
	public String checkout(HttpSession session, Model model) {

		User u = (User) session.getAttribute("user");
		List<Cart> byUser = cartService.findByUser(u);

		model.addAttribute("cart", byUser);
		return "checkout";

	}

	@GetMapping("/login")
	public String userLogin() {

		return "userLogin";

	}

	@GetMapping("/logout")
	public String logout(HttpSession session) {

		session.invalidate();
		return "redirect:/";

	}

	@GetMapping("/userorder")
	public String userOrders(Model model, HttpSession session) {
		User u = (User) session.getAttribute("user");
		List<Order> orderByUser = orderService.findByUser(u);
		model.addAttribute("orders", orderByUser);
		return "userorder";

	}

	/*
	 * Product productById = productService.productById(pid); String email =
	 * (String) session.getAttribute("email"); String pass = (String)
	 * session.getAttribute("pass"); System.out.println(email); User byEmail =
	 * (User) userService.findByEmail(email, pass);
	 * 
	 * List<Product> list = new ArrayList<>(); list.add(productById);
	 * model.addAttribute("productbyid", list); model.addAttribute("qty", qty);
	 * model.addAttribute("byEmail", byEmail);
	 */

}
