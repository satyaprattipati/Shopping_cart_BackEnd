package com.order.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.order.address.Address;
import com.order.exception.OrderNotFoundException;
import com.order.model.Orders;
import com.order.repository.AddressRepository;
import com.order.repository.OrderRepository;


@Service
public class OrderServiceImpl implements OrderService {

	private static String orderId;
	String ProfileId;

	@Autowired
	private OrderRepository orderRepository;

	@Autowired
	private AddressRepository addressRepository;
	
	
	@Override
	public Orders addOrder(Orders orders) {
		Orders savedOrders = orderRepository.save(orders);
		return savedOrders;
	}


	@Override
	public List<Orders> getAllOrders() {
		List<Orders> orders = orderRepository.findAll();
		if (orders == null) {
			throw new OrderNotFoundException("Products not found");
		} else {
			return orders;
		}
	}


	@Override
	public Orders getOrderById(String orderId) {
		Optional<Orders> optionalOrder = orderRepository.findById(orderId);
		if (optionalOrder.isEmpty()) {
			throw new OrderNotFoundException("Order not found with Id: " + orderId);
		} else {
			Orders orders = optionalOrder.get();
			return orders;
		}
	}


	@Override
	public void deleteOrderById(String orderId) {
		Optional<Orders> optionalOrders = orderRepository.findById(orderId);
		if (optionalOrders.isPresent()) {
			Orders orders = optionalOrders.get();
			orderRepository.delete(orders);

		} else {
			throw new OrderNotFoundException("Order not found with id: " + orderId);
		}

	}


	@Override
	public Orders updateOrder(Orders orders) {
		Optional<Orders> optionalOrders = orderRepository.findById(orders.getOrderId());
		if (optionalOrders == null) {
			throw new OrderNotFoundException("Order not Found");
		} else {
			Orders updatedOrder = orderRepository.save(orders);
			return updatedOrder;
		}

	}


	

//	@Override
//	public List<Orders> getOrderByProfileId(String profileId) {
//		List<Orders> optionalOrders = orderRepository.findByProfileId(profileId);
//		if (optionalOrders.isEmpty()) {
//			throw new OrderNotFoundException("Order not found with profile: ");
//		} else {
//			List<Orders> orders = optionalOrders;
//			return orders;
//		}
//	}


	@Override
	public List<Address> getAllAddress() {
		List<Address> address = addressRepository.findAll();
		if (address == null) {
			throw new OrderNotFoundException("Address not found");
		} else {
			return address;
		}
	}


	@Override
	public Address addAddress(Address address) {
		Address savedAddress = addressRepository.save(address);
		return savedAddress;
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
//	@Override
//	public List<Orders> getAllOrders() {
//		return orderRepo.findAll();
//	}
//
//	@Override
//	public List<Orders> getOrderByCustomerId(String customerId) {
//		return orderRepo.findBycustomerId(customerId);
//	}
//
//	@Override
//	public List<Address> getAddressByCustomerId(String customerId) {
//		return addressRepo.findByCustomerId(customerId);
//	}
//
//	@Override
//	public List<Address> getAllAddress() {
//		return addressRepo.findAll();
//	}
//
//	@Override
//	public Orders getOrderById() {
//		return null;
//	}
//
//	@Override
//	public Optional<Orders> getOrderById(String orderId) {
//		return orderRepo.findById(orderId);
//	}
//
//	@Override
//	public void storeAddress(Address address) {
//		addressRepo.save(address);
//	}
//
//	@Override
//	public String changeStatus(String orderStatus, String orderId) {
//		Orders order = orderRepo.findById(orderId).get();
//		order.setOrderStatus(orderStatus);
//		orderRepo.save(order);
//		return orderStatus;
//	}
//
//	@Override
//	public Orders updateOrder(Orders order) {
//		return orderRepo.save(order);
//	}
//
//	@Override
//	public String changeModeOfPayment(String paymentMethod, String orderId) {
//		Orders order = orderRepo.findById(orderId).get();
//		order.setModeOfPayment(paymentMethod);
//		orderRepo.save(order);
//		return paymentMethod;
//	}
//
//	@Override
//	public void placeOrder(Cart cart) {
//		int noOfAddress = getAddressByCustomerId(cart.getCartId()).size();
//		Orders order = new Orders();
//		order.setAmountPaid(cart.getTotalPrice());
//		order.setOrderStatus("Payment Pending");
//		order.setCustomerId(cart.getCartId());
//		order.setOrderDate(java.time.LocalDate.now());
//	//	order.setOrder(getListOfOrders(cart.getItems()));
//		order.setQuantity(order.getOrder().size());
//		order.setAddress(getAddressByCustomerId(cart.getCartId()).get(noOfAddress - 1));
//		orderRepo.save(order);
//	}
//
//	@Override
//	public void deleteOrder(String orderId) {
//		orderRepo.deleteById(orderId);
//
//	}
//
//	@Override
//	public void onlinePayment(Cart cart) {
//		// TODO Auto-generated method stub
//
//	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

//	@Override
//	public List<Orders> getOrderByProfileId(String profileId) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<Address> getAddressByProfileId(String profileId) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	
	


}
