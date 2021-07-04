package com.abc.techstore.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="shippinginfo_tbl")
public class ShippingInfo {
	public String orderId;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public String ShippingId;
	public double ShippingCost;
	public String ShippingAddress;
	public LocalDate ShippingDate;
	@OneToOne(mappedBy = "shippingDetails",cascade = CascadeType.ALL)
	private Order order;
	
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getShippingId() {
		return ShippingId;
	}
	public void setShippingId(String shippingId) {
		ShippingId = shippingId;
	}
	public double getShippingCost() {
		return ShippingCost;
	}
	public void setShippingCost(double shippingCost) {
		ShippingCost = shippingCost;
	}
	public String getShippingAddress() {
		return ShippingAddress;
	}
	public void setShippingAddress(String shippingAddress) {
		ShippingAddress = shippingAddress;
	}
	public LocalDate getShippingDate() {
		return ShippingDate;
	}
	public void setShippingDate(LocalDate shippingDate) {
		ShippingDate = shippingDate;
	}
	
}
