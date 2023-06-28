package com.cart.model;



import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/*
 * used Bean Validation in Model class 
 */

@Document(collection = "product")
public class Product {

	@Id
	private String productId;

	@NotNull(message = "Product name should not be empty")
	private String name;

	@NotNull(message = "Product price can not be null")
	private String price;

	private String description;
	private String catagory;

	public Product() {

	}

	public Product(String productId, @NotNull(message = "Product name should not be empty") String name,
			@NotNull(message = "Product price can not be null") String price, String description, String catagory) {
		super();
		this.productId = productId;
		this.name = name;
		this.price = price;
		this.description = description;
		this.catagory = catagory;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCatagory() {
		return catagory;
	}

	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", price=" + price + ", description="
				+ description + ", catagory=" + catagory + "]";
	}

	

	
}


