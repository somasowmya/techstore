package com.abc.techstore.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="product_tbl")
public class Product {
	@Id
	private String productId;
	private String productName;
	private double productPrice;
	private int productStock;
	private String productDescription;
	private LocalDate productDom;

	@OneToOne
	@JoinColumn(name = "product_orderitems")
	private OrderItems orderItems;
	
	public OrderItems getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(OrderItems orderItems) {
		this.orderItems = orderItems;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	@OneToOne
	@JoinColumn(name = "product_cart")
	private Cart cart;
	
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public int getProductStock() {
		return productStock;
	}
	public void setProductStock(int productStock) {
		this.productStock = productStock;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public LocalDate getProductDom() {
		return productDom;
	}
	public void setProductDom(LocalDate productDom) {
		this.productDom = productDom;
	}
	
	
	

}
