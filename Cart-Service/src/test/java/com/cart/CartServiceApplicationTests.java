package com.cart;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;



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

import com.cart.exception.CartValidationException;
import com.cart.model.Cart;
import com.cart.repositories.CartRepository;
import com.cart.service.CartService;






@SpringBootTest
class CartServiceApplicationTests {

  @Test
  void contextLoads() {
  }

  private static final int id = 0;
  @Autowired
  private CartService cartService;
  @MockBean
  private CartRepository cartRepository;

//  @Test
//  @DisplayName("Get All Product Test")


//  void getAllCartsTest() {
//		when(cartRepository.findAll()).thenReturn(Stream
//				.of(new Cart(99,["3","samsung",15000,"build quality is good","electronics"]),
//					new Cart(99,["3", "samsung", 15000, "build quality is good", "electronics"])).collect(Collectors.toList()));
//		assertEquals(2, cartService.getAllCarts().size());
//	}
//  
// 
//  
//  @Test
//  @DisplayName("Adding Cart Test")
//  public void addCartTest() throws CartValidationException {
//      Cart cart = new Cart(99,"3","samsung",15000,"build quality is good","electronics");
//      int id = 0;
//      cartService.addCart(cart);
//  }


}