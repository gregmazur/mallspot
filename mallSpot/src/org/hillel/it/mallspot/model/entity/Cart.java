package org.hillel.it.mallspot.model.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Cart extends BaseEntity {
	private long cartId;
	private User user;
	private String comments;
	private final Map<Long, CartItem> itemMap = Collections
			.synchronizedMap(new HashMap<Long, CartItem>());
	private final List<CartItem> itemList = new ArrayList<CartItem>();

	public Iterator<CartItem> getCartItems() {
		return itemList.iterator();
	}

	public List<CartItem> getCartItemList() {
		return itemList;
	}

	public int getNumberOfItems() {
		return itemList.size();
	}

	public Iterator<CartItem> getAllCartItems() {
		return itemList.iterator();
	}

	public boolean containsItemId(String itemId) {
		return itemMap.containsKey(itemId);
	}

	public void addItem(Product product) {
		CartItem cartItem = (CartItem) itemMap.get(product.getProductId());
		if (cartItem == null) {
			cartItem = new CartItem();
			cartItem.setItem(product);
			cartItem.setQuantity(0);
			itemMap.put(product.getProductId(), cartItem);
			itemList.add(cartItem);
		}
		cartItem.incrementQuantity();
	}

	public boolean removeItemById(String itemId) {
		CartItem cartItem = (CartItem) itemMap.remove(itemId);
		return itemList.remove(cartItem);

	}

	public void incrementQuantityByItemId(String itemId) {
		CartItem cartItem = (CartItem) itemMap.get(itemId);
		cartItem.incrementQuantity();
	}

	public void setQuantityByItemId(String itemId, int quantity) {
		CartItem cartItem = (CartItem) itemMap.get(itemId);
		cartItem.setQuantity(quantity);
	}

	public double getSubTotal() {
		double subTotal = 0;
		Iterator<CartItem> items = getAllCartItems();
		while (items.hasNext()) {
			CartItem cartItem = (CartItem) items.next();
			Product item = cartItem.getItem();
			double price = item.getPrice();
			subTotal = price * cartItem.getQuantity();
		}
		return subTotal;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public List<CartItem> getItemList() {
		return itemList;
	}
	

}
