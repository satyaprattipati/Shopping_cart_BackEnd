package com.product.controller;

import java.util.List;

import javax.validation.Valid;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.product.model.Admin;
import com.product.model.Product;
import com.product.service.ProductService;



@CrossOrigin(value = "http://localhost:3000/")
@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productService;

	/*
	 * This method is used to add new products
	 */

	@PostMapping("/addProduct")
	public ResponseEntity<Product> addProduct(@Valid @RequestBody Product product) {
		Product newProduct = productService.addProduct(product);
		ResponseEntity<Product> responseEntity = new ResponseEntity<>(newProduct, HttpStatus.CREATED);
		return responseEntity;
	}

	@GetMapping("/allProduct")
	public ResponseEntity<List<Product>> getAllProducts() {
		List<Product> allProducts = productService.getAllProduct();
		ResponseEntity<List<Product>> responseEntity = new ResponseEntity<List<Product>>(allProducts, HttpStatus.OK);
		return responseEntity;
	}

	@GetMapping("/get/{id}")
	public ResponseEntity<Product> fetchProductById(@PathVariable("id") String productId) {
		Product product = productService.getProductById(productId);
		ResponseEntity<Product> responseEntity = new ResponseEntity<Product>(product, HttpStatus.OK);
		return responseEntity;
	}

	@GetMapping("/getName/{name}")
	public ResponseEntity<Product> fetchProductByName(@PathVariable("name") String name) {
		Product product = productService.getProductByName(name);
		ResponseEntity<Product> responseEntity = new ResponseEntity<Product>(product, HttpStatus.OK);
		return responseEntity;
	}
	@GetMapping("/getCatagory/{catagory}")
	public ResponseEntity <List<Product>> fetchProductByCatagory(@PathVariable("catagory") String catagory) {
		List<Product> product = productService.getProductByCatagory(catagory);
		ResponseEntity<List<Product>> responseEntity = new ResponseEntity<>(product, HttpStatus.OK);
		return responseEntity;
	}
	
	
	@PutMapping("/update")
	public ResponseEntity<Product> updateProduct(@Valid @RequestBody Product product) {
		Product updatedProduct = productService.updateProduct(product);
		ResponseEntity<Product> responseEntity = new ResponseEntity<Product>(updatedProduct, HttpStatus.CREATED);
		return responseEntity;
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteProductById(@PathVariable("id") String productId) {
		productService.deleteProductById(productId);
		ResponseEntity<String> responseEntity = new ResponseEntity<String>("Product deleted successfully",
				HttpStatus.OK);
		return responseEntity;
	}
	
	
	@GetMapping("/alladmin")
	
	public List<Admin> getadmin() {
		

		return productService.getAllAdmins();

	}
	
	
	@PostMapping("/addadmin")
	
	public String saveadmin(@RequestBody Admin admin)
	{
		productService.saveadmin(admin);

      	return "Admin saved by ID:"+admin.getAdminId();
		
	}
	
	@PutMapping("/updateadmin")
	
	public String updateadmin(@RequestBody Admin admin) {
		productService.saveadmin(admin);
		return "Admin updated successfully with Id:" + admin.getAdminId();
	}
	
	
	
	
	
	
	@PostMapping("/admin-login")
	public ResponseEntity<Admin> doAdminLogin(@RequestParam("username") String username,
			@RequestParam("password") final String password) {

		Admin admin = productService.adminLogin(username, password);

		ResponseEntity<Admin> responseEntity = new ResponseEntity<>(admin, HttpStatus.OK);

		return responseEntity;

	}
	
	
//	@DeleteMapping("/deleteAdmin/{adminId}")
//	
//	public String deleteadmin(@PathVariable("id")  String adminId) {
//		productService.deleteadmin(adminId);
//		
//		return "Admin deleted with id "+adminId;
//	}
//	
	
	//@DeleteMapping("/admin/delete")
//	@ApiOperation(value = "To delete washpack Details")
//	public String deleteadmin(@PathVariable String AdminId ) {
//	 productService.deleteadmin(AdminId);
//	 return "Admin Deleted Succesfully!!!";
//
//	}
	


}
