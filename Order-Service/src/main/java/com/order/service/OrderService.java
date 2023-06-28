package com.order.service;

import java.util.List;

import com.order.address.Address;
import com.order.model.Orders;

public interface OrderService {
	Orders addOrder(Orders orders);
	
	List<Orders> getAllOrders();
	

	Orders getOrderById(String orderId);
	
	
	
	void deleteOrderById(String orderId);

	
	Orders updateOrder(Orders orders);
	
	
//	List<Orders> getOrderByProfileId(String profileId);
	List<Address> getAllAddress();
	Address addAddress(Address address);

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	List<Orders> getAllOrders();
//	List<Orders> getOrderByProfileId(String profileId);
//	List<Address> getAddressByProfileId(String profileId);
//	List<Address> getAllAddress();
//	Orders getOrderById();
//	Optional<Orders> getOrderById(String orderId);
//
//	void storeAddress(Address address);
//	String changeModeOfPayment(String paymentMethod, String orderId);
//	String changeStatus(String orderStatus, String orderId);
//	Orders updateOrder(Orders order);
//
//	void placeOrder(Cart cart);
//	void deleteOrder(String orderId);
//	void onlinePayment(Cart cart);

}
