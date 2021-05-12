package com.capg.msc.MyShoppingCart.dao;

import java.util.List;

import com.capg.msc.MyShoppingCart.bean.Product;

public interface CustomProductInterface {

	public List<Product> getProductByCategory(String proudctCategory);
	public List<Product> getProductByCategoryAndPrice(String proudctCategory,int range1,int range2);
	
}
