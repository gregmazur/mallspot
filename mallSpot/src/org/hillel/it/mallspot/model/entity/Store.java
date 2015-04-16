package org.hillel.it.mallspot.model.entity;

public class Store {
	private int storeId;
	private String name;
	private String description;
	private Product[] products;
	private String position;
	private Mall mall;
	private User storeAdmin;
	public Store(int storeId, String name, String description,
			 String position, Mall mall, User storeAdmin) {
		this.storeId = storeId;
		this.name = name;
		this.description = description;
		this.position = position;
		this.mall = mall;
		this.storeAdmin = storeAdmin;
	}
	public Store(){
		
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
