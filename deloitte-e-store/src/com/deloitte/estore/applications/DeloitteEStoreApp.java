package com.deloitte.estore.applications;

import com.deloitte.estore.model.Product;
import com.deloitte.estore.service.ProductService;
import com.deloitte.estore.service.ProductServiceImpl;

public class DeloitteEStoreApp {

	public static void main(String[] args) {
		
		ProductService service= new ProductServiceImpl();
		Product p= new Product(104,"COMPUTER",450);
		try
		{
			if(service.addProduct(p))
			{
				System.out.println("Product added");
			}
			else
			{
				System.out.println("Not added");
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

}
