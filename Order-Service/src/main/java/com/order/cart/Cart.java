package com.order.cart;

import java.util.List;



public class Cart {
	public String cartId;
	public double totalPrice;
	public List<Items> items;
	
	
	
	public Cart() {
		
	}
	public Cart(String cartId, double totalPrice, List<Items> items) {
		super();
		this.cartId = cartId;
		this.totalPrice = totalPrice;
		this.items = items;
	}
	public String getCartId() {
		return cartId;
	}
	public void setCartId(String cartId) {
		this.cartId = cartId;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public List<Items> getItems() {
		return items;
	}
	public void setItems(List<Items> items) {
		this.items = items;
	}
	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", totalPrice=" + totalPrice + ", items=" + items + "]";
	}
	
	
}
