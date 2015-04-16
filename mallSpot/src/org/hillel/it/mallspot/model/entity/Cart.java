package org.hillel.it.mallspot.model.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Cart extends BaseEntity {
	private final Map<String, CartItem> itemMap = Collections
			.synchronizedMap(new HashMap<String, CartItem>());
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

	public void addItem(Item item, boolean isInStock) {
		CartItem cartItem = (CartItem) itemMap.get(item.getItemId());
		if (cartItem == null) {
			cartItem = new CartItem();
			cartItem.setItem(item);
			cartItem.setQuantity(0);
			cartItem.setInStock(isInStock);
			itemMap.put(item.getItemId(), cartItem);
			itemList.add(cartItem);
		}
		cartItem.incrementQuantity();
	}

	public Item removeItemById(String itemId) {
		CartItem cartItem = (CartItem) itemMap.remove(itemId);
		if (cartItem == null) {
			return null;
		} else {
			itemList.remove(cartItem);
			return cartItem.getItem();
		}
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
			Item item = cartItem.getItem();
			double listPrice = item.getListPrice();
			subTotal = listPrice * cartItem.getQuantity();
		}
		return subTotal;
	}

}
