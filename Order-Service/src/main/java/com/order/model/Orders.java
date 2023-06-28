package com.order.model;


import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.order.address.Address;
import com.order.product.Product;





@Document(collection = "orders")
public class Orders {
	
	@Id
	public String orderId;
	public String orderDate;
	public String profileId;
	public String amountPaid;
	public String modeOfPayment;
	public String orderStatus;
	
	public Address address;
	public List<Product> product;
	
	public Orders() {
		
	}

	public Orders(String orderId, String orderDate, String profileId, String amountPaid, String modeOfPayment,
			String orderStatus, Address address, List<Product> product) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.profileId = profileId;
		this.amountPaid = amountPaid;
		this.modeOfPayment = modeOfPayment;
		this.orderStatus = orderStatus;
		this.address = address;
		this.product = product;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getProfileId() {
		return profileId;
	}

	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}

	public String getAmountPaid() {
		return amountPaid;
	}

	public void setAmountPaid(String amountPaid) {
		this.amountPaid = amountPaid;
	}

	public String getModeOfPayment() {
		return modeOfPayment;
	}

	public void setModeOfPayment(String modeOfPayment) {
		this.modeOfPayment = modeOfPayment;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", orderDate=" + orderDate + ", profileId=" + profileId + ", amountPaid="
				+ amountPaid + ", modeOfPayment=" + modeOfPayment + ", orderStatus=" + orderStatus + ", address="
				+ address + ", product=" + product + "]";
	}
	
	
}
