package org.hillel.it.mallspot.model.entity;

import java.util.List;

public class Store {
	private int storeId;
	private String name;
	private String description;
	private List<Product> products;
	private String position;
	private Mall mall;
	private User storeAdmin;//what it sells
	private String category;
	
	public Store(int storeId, String name, String description,
			 String position, Mall mall, User storeAdmin) {
		this.storeId = storeId;
		this.name = name;
		this.description = description;
		this.position = position;
		this.mall = mall;
		this.storeAdmin = storeAdmin;
	}
	public Store(){}
	
	public boolean mallEquals(Mall mall){
		return mall.equals(this.mall);
	}
	public boolean containsProduct(Product product){
		return products.contains(product);
	}
	public boolean storeAdminEquals(User user){
		return user.equals(storeAdmin);
	}
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getStoreId() {
		return storeId;
	}
	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Product> getProducts() {
		return products;
	}
	public boolean addProduct(Product product){
		return products.add(product);
	}
	public boolean removeProduct(Product product){
		return products.remove(product);
	}

	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public Mall getMall() {
		return mall;
	}
	public void setMall(Mall mall) {
		this.mall = mall;
	}
	public User getStoreAdmin() {
		return storeAdmin;
	}
	public void setStoreAdmin(User storeAdmin) {
		this.storeAdmin = storeAdmin;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + storeId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Store other = (Store) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (storeId != other.storeId)
			return false;
		return true;
	}
	
}
