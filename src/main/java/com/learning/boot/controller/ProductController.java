package com.learning.boot.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learning.boot.Service.ProductService;
import com.learning.boot.entity.Product;

@RestController
public class ProductController {
	
	private ProductService productService;
	
	public ProductController(ProductService productService) {
		this.productService = productService;
	}
	
	@PostMapping("/saveProduct")
	public Product saveProduct(@RequestBody Product product) {
		return productService.saveProduct(product);
	}
	
	@GetMapping("/getAllProducts")
	public List<Product> getAll(){
		return productService.getAllProducts();
	}
	
	@GetMapping("/getProduct/{id}")
	public Product getProductById(@PathVariable int id) {
		return productService.getProductById(id);
	}
}
