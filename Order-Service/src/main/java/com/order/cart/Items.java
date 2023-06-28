package com.order.cart;




public class Items {
	public String productId;
	public String productName;
	
	public String price;

	public Items () {
		
	}
	
	public Items(String productId, String productName, String price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Items [productId=" + productId + ", productName=" + productName + ", price=" + price + "]";
	}
	
	
}
