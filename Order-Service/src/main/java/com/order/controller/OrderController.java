package com.order.controller;

import java.util.List;


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
import org.springframework.web.bind.annotation.RestController;

import com.order.address.Address;
import com.order.model.Orders;
import com.order.service.OrderService;



@RestController
@CrossOrigin(value = "http://localhost:3000/")
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	@PostMapping("/placeOrder")
	public ResponseEntity<Orders> addOrder( @RequestBody Orders orders) {
		Orders newOrders = orderService.addOrder(orders);
		ResponseEntity<Orders> responseEntity = new ResponseEntity<>(newOrders, HttpStatus.CREATED);
		return responseEntity;
	}
	
	@GetMapping("/allOrders")
	public ResponseEntity<List<Orders>> getAllOrders() {
		List<Orders> allOrders = orderService.getAllOrders();
		ResponseEntity<List<Orders>> responseEntity = new ResponseEntity<List<Orders>>(allOrders, HttpStatus.OK);
		return responseEntity;
	}
	
	
	@GetMapping("/getOrder/{id}")
	public ResponseEntity<Orders> fetchOrderById(@PathVariable("id") String orderId) {
		Orders orders = orderService.getOrderById(orderId);
		ResponseEntity<Orders> responseEntity = new ResponseEntity<Orders>(orders, HttpStatus.OK);
		return responseEntity;
	}
	
	
	@DeleteMapping("/deleteOrder/{id}")
	public ResponseEntity<String> deleteOrderById(@PathVariable("id") String orderId) {
		orderService.deleteOrderById(orderId);
		ResponseEntity<String> responseEntity = new ResponseEntity<String>("order deleted successfully",
				HttpStatus.OK);
		return responseEntity;
	}
	
	
	@PutMapping("/update")
	public ResponseEntity<Orders> updateProduct( @RequestBody Orders orders) {
		Orders updatedOrders = orderService.updateOrder(orders);
		ResponseEntity<Orders> responseEntity = new ResponseEntity<Orders>(updatedOrders, HttpStatus.CREATED);
		return responseEntity;
	}
	
	
//	@GetMapping("/getprofile/{profileId}")
//	public ResponseEntity <List<Orders>> fetchOrderByProfileId(@PathVariable("profileId") String profileId) {
//		List<Orders> Orders = orderService.getOrderByProfileId(profileId);
//		ResponseEntity<List<Orders>> responseEntity = new ResponseEntity<>(Orders,HttpStatus.OK);
//		return responseEntity;
//	}
//	
//	
	
	@GetMapping("/allAddress")
	public ResponseEntity<List<Address>> getAllAddress() {
		List<Address> allAddress = orderService.getAllAddress();
		ResponseEntity<List<Address>> responseEntity = new ResponseEntity<List<Address>>(allAddress, HttpStatus.OK);
		return responseEntity;
	}
	
	
	@PostMapping("/placeAddress")
	public ResponseEntity<Address> addAddress( @RequestBody Address address) {
		Address newAddress = orderService.addAddress(address);
		ResponseEntity<Address> responseEntity = new ResponseEntity<>(newAddress, HttpStatus.CREATED);
		return responseEntity;
	}
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

//	@GetMapping("/customer/{customerId}")
//	List<Orders> allOrdersOfCustomer(@PathVariable("customerId") String customerId)
//	{
//		return orderService.getOrderByCustomerId(customerId);
//	}
//
//	@GetMapping("/address/{customerId}")
//	List<Address> allAddressOfCustomer(@PathVariable("customerId") String customerId)
//	{
//		return orderService.getAddressByCustomerId(customerId);
//	}
//

////
//	@PutMapping("/changeStatus/{orderId}")
//	public String changeOrderstatus(@PathVariable String orderId, @RequestBody String status)
//	{
//		return orderService.changeStatus(status,orderId);
//	}
//

//	@PutMapping("/modeOfPayment/{orderId}")
//	public String updateModeOfPayment(@PathVariable String orderId, @RequestBody String paymentMethod)
//	{
//		return orderService.changeModeOfPayment(paymentMethod,orderId);
//	}
//

}
