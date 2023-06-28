package com.product;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.mockito.Mockito.when;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.product.exception.ProductValidationException;
import com.product.model.Product;
import com.product.repository.ProductRepository;
import com.product.service.ProductService;



@SpringBootTest
class ProductServiceApplicationTests {

    @Test
    void contextLoads() {
    }

    private static final int id = 0;
    @Autowired
    private ProductService productService;
    @MockBean
    private ProductRepository productRepository;

    @Test
    @DisplayName("Get All Product Test")


    void getAllProductsTest() {
		when(productRepository.findAll()).thenReturn(Stream
				.of(new Product("3", "samsung", 15000, "build quality is good", "electronics","images"),
					new Product("3", "samsung", 15000, "build quality is good", "electronics","images")).collect(Collectors.toList()));
		assertEquals(2, productService.getAllProduct().size());
	}
    
   
    
    @Test
    @DisplayName("Adding Product Test")
    public void addProductTest() throws ProductValidationException {
        Product product = new Product("3", "samsung", 15000, "build quality is good", "electronics","images");
        int id = 0;
        productService.addProduct(product);
    }

    @Test
    @DisplayName("Update Product Test")
    public void updateProductTest() {
        Product product = new Product("3", "samsung", 15000, "build quality is good", "electronics","images");
        int id = 0;
        productService.updateProduct(product);
    }

}
