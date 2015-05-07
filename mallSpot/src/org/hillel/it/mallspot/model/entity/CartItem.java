package org.hillel.it.mallspot.model.entity;

public class CartItem extends BaseEntity {

	
	private Product item;
	private int quantity;
	private double total;
	private String comments;// specified description(wishes) of product



	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getTotal() {
		return total;
	}

	public Product getItem() {
		return item;
	}

	public void setItem(Product item) {
		this.item = item;
		calculateTotal();
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
		calculateTotal();
	}

	public void incrementQuantity() {
		quantity++;
		calculateTotal();
	}

	private void calculateTotal() {
		if (item != null && item.getPrice() != (Double) null) {
			total = item.getPrice() * getQuantity();
		} else {
			total = (Double) null;
		}
	}

}
