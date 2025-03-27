package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.Cart;
import com.model.User;
import com.razorpay.Order;
import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
import com.service.CartService;
import com.service.ProductService;
import com.service.UserService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
public class CartController {

	@Autowired
	ProductService productService;

	@Autowired
	UserService userService;

	@Autowired
	CartService cartService;

	@GetMapping("/cart")
	public String cart(Model model, HttpSession session) {

		User u = (User) session.getAttribute("user");

		if (u == null) {
			return "redirect:/login";
		}

		model.addAttribute("cart", cartService.findByUser(u));

		return "cart";

	}

	@PostMapping("/addcart")
	public String addCart(@RequestParam("pid") int id, @RequestParam("quantity") int qty, HttpSession session,
			@ModelAttribute("cart") Cart c) {

		User u = (User) session.getAttribute("user");

		if (u == null) {
			return "redirect:/login";
		}

		c.setProduct(productService.productById(id));
		c.setUser(userService.getUserById(u.getId()));
		c.setQty(qty);

		cartService.addOrUpdateCart(c);

		session.setAttribute("count", cartService.count());

		return "redirect:/cart";
	}

	@GetMapping("/remove")
	public String removeCart(@RequestParam("cid") int id) {

		cartService.deleteById(id);

		return "redirect:/cart";

	}

	@GetMapping("/payment")
	public void Payment(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		PrintWriter pw = resp.getWriter();
		double amt = Double.parseDouble(req.getParameter("amt"));
		System.out.println(amt);
		JSONObject orderRequest = new JSONObject();
		orderRequest.put("amount", amt * 100); // Amount is in currency subunits. Default currency is INR. Hence, 50000
												// refers to 50000 paise
		orderRequest.put("currency", "INR");
		orderRequest.put("receipt", "receipt#1");
		JSONObject notes = new JSONObject();
		notes.put("notes_key_1", "Tea, Earl Grey, Hot");
		orderRequest.put("notes", notes);

		try {
			RazorpayClient razorpay = new RazorpayClient("rzp_test_FtWVVt6YTsOyuV", "Z1hlUOzoBkoRFjFUkymGR604");
			Order order = razorpay.orders.create(orderRequest);
			pw.append(order.toString());

		} catch (RazorpayException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
