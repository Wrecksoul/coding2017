package com.coderising.ood.srp.refact.entity;

public class Product {
	private String productID;
	private String productDesc;

	public Product() {
	}

	public Product(String productID, String productDesc) {
		super();
		this.setProductID(productID);
		this.setProductDesc(productDesc);
	}

	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

}
