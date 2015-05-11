package org.hillel.it.mallspot.model.entity;

public class Order extends BaseEntity {
	private User user;
	private Cart cart;
	private String additionalInfo;
	
	public Order(User user, Cart cart, String additionalInfo) {
		super();
		this.user = user;
		this.cart = cart;
		this.additionalInfo = additionalInfo;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public String getAdditionalInfo() {
		return additionalInfo;
	}

	public void setAdditionalInfo(String additionalInfo) {
		this.additionalInfo = additionalInfo;
	}
	

}
