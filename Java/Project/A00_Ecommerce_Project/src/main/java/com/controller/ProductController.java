package com.controller;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.Product;
import com.service.CategoryService;
import com.service.ProductService;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.Part;

@Controller
public class ProductController {

	@Autowired
	ProductService service;

	@Autowired
	CategoryService categoryService;

	@GetMapping("/product")
	public String product(Model model) {
		model.addAttribute("product", new Product());
		model.addAttribute("products", service.allProducts());
		model.addAttribute("categories", categoryService.allCategory());

		return "product";

	}

	@PostMapping("/addProduct")
	public String addProduct(HttpServletRequest req) throws IOException, ServletException {

		String uid = req.getParameter("pid");
		int id = 0;
		if (!uid.equals("")) {
			id = Integer.parseInt(uid);
		}
		String name = req.getParameter("name");
		int cat = Integer.parseInt(req.getParameter("category"));
		double price = Double.parseDouble(req.getParameter("price"));
		int qty = Integer.parseInt(req.getParameter("qty"));
		Part part = req.getPart("img");

		String filename = Paths.get(part.getSubmittedFileName()).getFileName().toString();

		String fileNameToStore = System.currentTimeMillis() + "_" + filename;
		System.out.println(name + " " + cat + " " + price + " " + qty + " " + fileNameToStore);

		String path = req.getServletContext().getRealPath("") + File.separator + "img";

		File file = new File(path);

		if (!file.exists()) {
			file.mkdir();
		}

		part.write(path + File.separator + fileNameToStore);

		Product p;

		if (id > 0) {
			p = service.productById(id);
		} else {
			p = new Product();
		}

		p.setProductName(name);
		p.setProductPrice(price);
		p.setProductQty(qty);
		p.setCategory(categoryService.categoryById(cat));
		p.setProductImage(fileNameToStore);

		service.addOrUpdateProduct(p);
		return "redirect:/product";

	}

	@GetMapping("/deletepro")
	public String deleteProduct(@RequestParam("id") int did) {
		service.deleteById(did);
		return "redirect:/product";

	}

	@GetMapping("/editpro")
	public String ProductById(@RequestParam("id") int uid, Model model) {
		model.addAttribute("product", service.productById(uid));
		model.addAttribute("products", service.allProducts());
		model.addAttribute("categories", categoryService.allCategory());

		return "product";

	}

	
}
