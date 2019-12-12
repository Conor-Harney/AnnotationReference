package com.springExample.springbootSample.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springExample.springbootSample.entities.Product;
import com.springExample.springbootSample.services.ProductJPARepository;

@RestController
public class ProductController {

	@Autowired
	private ProductJPARepository productService;

	@GetMapping("/welcome")
	public String sayHi() {
		return "Welcome to product page";
	}

	@GetMapping("/product")
	public Product getProduct() {
		Product myProduct = new Product(1, "A", 10);
		return myProduct;
	}

	@GetMapping("/products")
	public List<Product> getProducts() {
		/*
		 * List<Product> myProducts = new ArrayList<Product>(); myProducts.add(new
		 * Product(1, "A", 10)); myProducts.add(new Product(2, "B", 20));
		 * myProducts.add(new Product(3, "C", 30));
		 */
		return productService.findAll();
	}

	@GetMapping("/product/{id}")
	public Product getProductById(@PathVariable int id) {
		return productService.findById(id).get();
	}

	@DeleteMapping("/product/{id}")
	public void deleteProduct(@PathVariable int id) {
		productService.deleteById(id);
	}

	@PostMapping("/product")
	public void postProduct(@RequestBody Product product) {
		productService.save(product);
	}

}
