package com.abc.techstore.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="cart_tbl")
public class Cart {
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "cartid")
	private int cartId;
	
	@OneToMany(mappedBy="cart", cascade= CascadeType.ALL)
	private List<CartItems> cartItems;
	@OneToOne
	private Customer customer;

	
	
	public List<CartItems> getCartItems() {
		return cartItems;
	}

	public void setCartItems(List<CartItems> cartItems) {
		this.cartItems = cartItems;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	
	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	

	

}

