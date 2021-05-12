package com.capg.msc.MyShoppingCart.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.msc.MyShoppingCart.bean.Product;

public interface ProductService  {

	public Product insertProduct(Product p);

	public List<Product> getAllProducts();
	
	public List<Product> updateProductById(Product p);

	public List<Product> deleteById(Product p);
	
	public List<Product> getAllProductsByCategory(String category);
	
	public List<Product> getAllProductsByCategoryAndPrice(String category,int range1,int range2);

}
