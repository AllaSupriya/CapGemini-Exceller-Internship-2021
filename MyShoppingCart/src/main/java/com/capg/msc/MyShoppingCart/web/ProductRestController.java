package com.capg.msc.MyShoppingCart.web;

import java.time.LocalDateTime;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.capg.msc.MyShoppingCart.bean.Product;
import com.capg.msc.MyShoppingCart.exception.InvalidCategoryException;
import com.capg.msc.MyShoppingCart.exception.InvalidCostRangeException;
import com.capg.msc.MyShoppingCart.service.ProductService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Validated
@RestController
@RequestMapping("/api")
@Api(value = "Online Laptop Store",description = "Various api works on laptop inventory management")
public class ProductRestController {
	@Autowired
	private ProductService service;
	
	@GetMapping("/home")
	public String homeRequest() {
		return "Welcome : "+LocalDateTime.now();
	}
	
	@ApiOperation(value = "product post mapping" , response = Product.class)
	@PostMapping("/product")
	public Product insertProduct(@RequestBody @Valid Product p) {
		service.insertProduct(p);
		return p;
	}
	
	@GetMapping("/product/{id}")
	public Product getProductById(@PathVariable int id) {
		return service.getProductById(id);
		
	}
	
	@ApiOperation(value = "product Get mapping to fatch all products" , response = List.class)
	@GetMapping("/products")
	public List<Product> getAllProducts(){
		return service.getAllProducts();
	}
	
	@PutMapping("/product/update")
	public List<Product> updateById(@RequestBody Product p){
		return service.updateProductById(p);
	}
	
	@GetMapping("/product/delete")
	public List<Product> deleteById(@RequestBody Product p){
		return service.deleteById(p);
	}
	
	@GetMapping("/products/{category}")
	public List<Product> getAllProductsByCategory(@PathVariable String category) throws InvalidCategoryException{
		if(!(category.equals("Laptop")|| category.equals("TV"))) {
			throw new InvalidCategoryException(category);
		}
		
		return service.getAllProductsByCategory(category);
	}

	@GetMapping("/products/{category}/{range1}/{range2}")
	public List<Product> getAllProductsByCategoryAndPrice(@PathVariable String category,
			@PathVariable int range1,@PathVariable int range2)throws InvalidCostRangeException {
		if(category.equals("Laptop")&&range1<10000) {
			throw new InvalidCostRangeException(range1,range2);
		}
		return service.getAllProductsByCategoryAndPrice(category, range1, range2);
	}
}

