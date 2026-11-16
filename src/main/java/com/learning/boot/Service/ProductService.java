package com.learning.boot.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.boot.Repository.ProductRepository;
import com.learning.boot.entity.Product;
import com.learning.boot.exception.ProductNotFoundException;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
		// TODO Auto-generated constructor stub
	}
	
	public Product saveProduct(Product product) {
		if(product.getPrice()<=0) {
			throw new IllegalArgumentException("Product prize must be greater than 0");
		}
		return productRepository.save(product);
	}
	
	public List<Product> getAllProducts(){
		return productRepository.findAll();
	}
	
	public Product getProductById(int id) {
		return productRepository.findById(id).orElseThrow(() -> new ProductNotFoundException("product is not exist with id:"+id));
	}
}
