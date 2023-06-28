package com.product.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.exception.AdminNotFoundException;
import com.product.exception.AuthenticationFailureException;
import com.product.exception.ProductAlreadyExistException;
import com.product.exception.ProductNotFoundException;
import com.product.model.Admin;
import com.product.model.Product;
import com.product.repository.AdminRepository;
import com.product.repository.ProductRepository;



@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;
    @Autowired
    private AdminRepository adminRepository;
	@Override
	public Product addProduct(Product product) {

		Product savedProduct = productRepository.save(product);
		return savedProduct;


	}

	@Override
	public List<Product> getAllProduct() {
		List<Product> products = productRepository.findAll();
		if (products == null) {
			throw new ProductNotFoundException("Products not found");
		} else {
			return products;
		}

	}

	@Override
	public Product getProductById(String productId) {
		Optional<Product> optionalProduct = productRepository.findById(productId);
		if (optionalProduct.isEmpty()) {
			throw new ProductNotFoundException("Product not found with Id: " + productId);
		} else {
			Product product = optionalProduct.get();
			return product;
		}

	}

	@Override
	public Product updateProduct(Product product) {
		Optional<Product> optionalProduct = productRepository.findById(product.getProductId());
		if (optionalProduct == null) {
			throw new ProductNotFoundException("Product not Found");
		} else {
			Product updatedProduct = productRepository.save(product);
			return updatedProduct;
		}

	}

	@Override
	public void deleteProductById(String productId) {
		Optional<Product> optionalProduct = productRepository.findById(productId);
		if (optionalProduct.isPresent()) {
			Product product = optionalProduct.get();
			productRepository.delete(product);

		} else {
			throw new ProductNotFoundException("Product not found with id: " + productId);
		}

	}

	@Override
	public Product getProductByName(String name) {
		Optional<Product> optionalProduct = productRepository.findByName(name);
		if (optionalProduct.isEmpty()) {
			throw new ProductNotFoundException("Product not found with Id: " + name);
		} else {
			Product product = optionalProduct.get();
			return product;
		}
	}

	@Override
	public List<Product> getProductByCatagory(String catagory) {
	List<Product> optionalProduct = productRepository.findByCatagory(catagory);
		if (optionalProduct.isEmpty()) {
			throw new ProductNotFoundException("Product not found with catagory: ");
		} else {
			List<Product> product = optionalProduct;
			return product;
		}
	}

	@Override
	public List<Admin> getAllAdmins() {
	
		return adminRepository.findAll();
	}

	@Override
	public void saveadmin(Admin admin) {
	  adminRepository.save(admin);
		
	}

	@Override
	public void updateadmin(Admin admin) {
		
		adminRepository.save(admin);
	}

	@Override
	public void deleteadmin(String adminId) {
		Optional<Admin> optionalAdmin = adminRepository.findById(adminId);

		if (optionalAdmin.isPresent()) {
					
			adminRepository.deleteById(adminId);
				}
				else {
					
					throw new AdminNotFoundException ("Admin not found with id: " + adminId);
				}
			}

	@Override
	public Admin adminLogin(String username, String password) {
		Admin admin = adminRepository.findByUsernameAndPassword(username, password);
		if (admin == null) {
			throw new AuthenticationFailureException("Username or password is incorrect");
		}

		return admin;
	}

	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

//	@Override
//	public Admin addAdmin(Admin admin) {
//	
//		return productRepository.save(admin);
//	}
//	
//	@Override
//	public Admin adminLogin(String username, String password) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Admin updateAdmin(Admin admin) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public void deleteAdmin(String adminId) {
//		// TODO Auto-generated method stub
		
	//}

}
