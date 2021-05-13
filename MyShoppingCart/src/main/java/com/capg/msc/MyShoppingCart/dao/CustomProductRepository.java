package com.capg.msc.MyShoppingCart.dao;

import java.util.List;

import com.capg.msc.MyShoppingCart.bean.Product;
import com.capg.msc.MyShoppingCart.exception.InvalidCategoryException;
import com.capg.msc.MyShoppingCart.exception.InvalidCostRangeException;

public interface CustomProductRepository {

	public List<Product> getProductByCategory(String proudctCategory) throws InvalidCategoryException;
	public List<Product> getProductByCategoryAndPrice(String proudctCategory,int range1,int range2) throws InvalidCostRangeException;
	
	
}
