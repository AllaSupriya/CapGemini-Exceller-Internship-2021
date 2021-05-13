package com.capg.msc.MyShoppingCart.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.capg.msc.MyShoppingCart.bean.Product;
import com.capg.msc.MyShoppingCart.exception.InvalidCategoryException;
import com.capg.msc.MyShoppingCart.exception.InvalidCostRangeException;



public class CustomProductRepositoryImpl implements CustomProductRepository {

	@Autowired
	EntityManager entityManager; // Session of Hibernate
	
	
	@Override
	public List<Product> getProductByCategory(String category) throws InvalidCategoryException{
		
		Query q = entityManager.createQuery("from Product where category=:category");
		q.setParameter("category", category);
		return q.getResultList();
	}


	@Override
	public List<Product> getProductByCategoryAndPrice(String category, int range1, int range2)  throws InvalidCostRangeException{
		Query q = entityManager.createQuery("from Product where category=:category "
				+ "and productCost BETWEEN :range1 and :range2");
		q.setParameter("category", category);
		q.setParameter("range1", range1);
		q.setParameter("range2", range2);
		
		return q.getResultList();
	}
	
	

}