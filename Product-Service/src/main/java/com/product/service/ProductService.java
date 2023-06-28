package com.product.service;

import java.util.List;

import com.product.model.Admin;
import com.product.model.Product;




public interface ProductService {

	

	Product addProduct(Product product);

	List<Product> getAllProduct();

	Product getProductById(String productId);

	List<Product> getProductByCatagory(String catagory);

	Product updateProduct(Product product);

	void deleteProductById(String productId);

	Product getProductByName(String name);
	Admin adminLogin(String username, String password);
	 public List<Admin> getAllAdmins();
	 public void saveadmin(Admin admin);
	 public void updateadmin(Admin admin);
	 public void deleteadmin(String adminId);
	// public void deleteAdmin(int id);
	 
	 
//	Admin adminLogin(String username, String password);
//	Admin updateAdmin(Admin admin);
//	void deleteAdmin(String adminId);

}
