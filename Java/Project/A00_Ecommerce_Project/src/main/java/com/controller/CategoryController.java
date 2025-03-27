package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.Category;
import com.service.CategoryService;
import com.service.ProductService;

@Controller
public class CategoryController {
	@Autowired
	CategoryService service;
	@Autowired
	ProductService productService;

	@GetMapping("/category")
	public String category(Model model) {

		model.addAttribute("category", new Category());
		model.addAttribute("categories", service.allCategory());
		return "category";

	}

	@PostMapping("/addcategory")
	public String addcategory(@ModelAttribute("category") Category cat) {
		service.addOrUpdateCategory(cat);
		return "redirect:/category";

	}

	@GetMapping("/delete")
	public String deleteCategory(@RequestParam("cid") int id) {
		service.categoryDeleteById(id);
		return "redirect:/category";

	}

	@GetMapping("/edit")
	public String categoryByid(@RequestParam("cid") int id, Model model) {

		model.addAttribute("category", service.categoryById(id));
		model.addAttribute("categories", service.allCategory());
		return "category";
	}

	

}
