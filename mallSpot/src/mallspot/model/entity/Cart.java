package mallspot.model.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Cart extends BaseEntity {
	private User user;
	private final Map<Integer, CartItem> itemMap = Collections
			.synchronizedMap(new HashMap<Integer, CartItem>());
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

	public boolean containsItemId(long itemId) {
		return itemMap.containsKey(itemId);
	}

	public void addItem(Product product) {
		CartItem cartItem = (CartItem) itemMap.get(product.getId());
		if (cartItem == null) {
			cartItem = new CartItem();
			cartItem.setItem(product);
			cartItem.setQuantity(0);
			itemMap.put(product.getId(), cartItem);
			itemList.add(cartItem);
		}
		cartItem.incrementQuantity();
	}

	public boolean removeItemById(long itemId) {
		CartItem cartItem = (CartItem) itemMap.remove(itemId);
		return itemList.remove(cartItem);

	}

	public void incrementQuantityByItemId(long itemId) {
		CartItem cartItem = (CartItem) itemMap.get(itemId);
		cartItem.incrementQuantity();
	}

	public void setQuantityByItemId(long itemId, int quantity) {
		CartItem cartItem = (CartItem) itemMap.get(itemId);
		cartItem.setQuantity(quantity);
	}

	public float getSubTotal() {
		float subTotal = 0;
		Iterator<CartItem> items = getAllCartItems();
		while (items.hasNext()) {
			CartItem cartItem = (CartItem) items.next();
			Product item = cartItem.getItem();
			float price = item.getPrice();
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

	public List<CartItem> getItemList() {
		return itemList;
	}
	

}
