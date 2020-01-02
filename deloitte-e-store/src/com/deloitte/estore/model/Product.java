package com.deloitte.estore.model;

public class Product {

	private int productId;
	private String productName;
	private float price;
	
	public Product() {
		
	}

	public Product(int productId, String productName, float price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [Product Id = " + productId + ", Product Name = " + productName + ", Price = " + price + "]";
	}
	
}