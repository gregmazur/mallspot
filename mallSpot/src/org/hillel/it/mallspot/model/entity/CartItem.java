package org.hillel.it.mallspot.model.entity;

public class CartItem extends BaseEntity {

	
	private Product item;
	private int quantity;
	private String comments;// specified description(wishes) of product



	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Product getItem() {
		return item;
	}

	public void setItem(Product item) {
		this.item = item;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void incrementQuantity() {
		quantity++;
	}

	private float calculateTotal() {
		return item.getPrice()*quantity;
	}

}
