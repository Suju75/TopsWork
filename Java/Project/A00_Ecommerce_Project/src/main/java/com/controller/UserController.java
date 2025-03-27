package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.User;
import com.service.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
public class UserController {

	@Autowired
	UserService service;

	@GetMapping("/user")
	public String users(Model model) {

		model.addAttribute("users", service.allUsers());
		return "user";

	}

	@GetMapping("/registration")
	public String reg(Model model) {

		return "registration";
	}

	@PostMapping("/addUser")
	public String addUser(@ModelAttribute("user") User user) {

		System.out.println(user.getName() + " " + user.getEmail() + " " + user.getPhone() + " " + user.getPassword());

		service.addOrUpdateUser(user);
		return "redirect:/registration";

	}

	@GetMapping("/deletee")
	public String deleteUserById(@RequestParam("did") int id) {

		service.deleteUserById(id);

		return "redirect:/registration";

	}

	@GetMapping("/editt")
	public String editUserById(@RequestParam("uid") int id, Model model) {

		model.addAttribute("user", service.getUserById(id));

		return "registration";

	}

	@PostMapping("/checkLogin")
	public String checkLogin(@RequestParam("email") String email,@RequestParam("password")String pass, HttpSession session) {

		User users = service.findByEmail(email,pass);
		System.out.println(users);

		if (users==null) {
			return "redirect:/login";

		}

		session.setAttribute("email", email);
		session.setAttribute("pass", pass);
		session.setAttribute("user", users);
		
		return "redirect:/";

	}

}
