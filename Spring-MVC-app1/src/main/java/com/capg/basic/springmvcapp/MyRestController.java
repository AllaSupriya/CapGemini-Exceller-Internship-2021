package com.capg.basic.springmvcapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyRestController {
	
	@Autowired
	ProductDAOImpl dao;	
	
	public MyRestController() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Inside");
	}

	/*@GetMapping("/hello")
	public String sayHello()
	{
		return "Hello";
	}*/
    
	//            localhost:9090:\product\10000\40000
	//  endpoint :- www.abc.com\product\10000\40000
	@GetMapping("/product2/range/{r1}/{r2}")
	public List<Product> getProductsbyrange(@PathVariable int r1 ,@PathVariable int r2)
	{
		return dao.getProductsByRange(r1, r2);
	}
	
	// ..../product/101
	@GetMapping("/product1/id/{searchid}")
	public Product getProductByid(@PathVariable int searchid)
	{
		return dao.getProductById(searchid);
	}
	
	@GetMapping("/product/all")
	public List<Product> getAllProducts(){
		return dao.getAllProducts();
	}
	
}
