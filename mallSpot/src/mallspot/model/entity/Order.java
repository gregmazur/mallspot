package mallspot.model.entity;

import java.util.ArrayList;
import java.util.List;

public class Order extends BaseEntity {
	private User user;
	private List<CartItem> itemList = new ArrayList<CartItem>();
	private String additionalInfo;
	
	public Order(User user, Cart cart, String additionalInfo) {
		super();
		this.user = user;
		itemList = cart.getCartItemList();
		this.additionalInfo = additionalInfo;
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

	public void setItemList(List<CartItem> itemList) {
		this.itemList = itemList;
	}

	public String getAdditionalInfo() {
		return additionalInfo;
	}

	public void setAdditionalInfo(String additionalInfo) {
		this.additionalInfo = additionalInfo;
	}
	

}
