package com.product.model;

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
	private double price;

	private String description;
	private String catagory;
	private String image;

	public Product() {

	}

	public Product(String productId, @NotNull(message = "Product name should not be empty") String name,
			@NotNull(message = "Product price can not be null") double price, String description, String catagory,
			String image) {
		super();
		this.productId = productId;
		this.name = name;
		this.price = price;
		this.description = description;
		this.catagory = catagory;
		this.image = image;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
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

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", price=" + price + ", description="
				+ description + ", catagory=" + catagory + ", image=" + image + "]";
	}

	
	
}
