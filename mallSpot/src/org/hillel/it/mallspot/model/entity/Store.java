package org.hillel.it.mallspot.model.entity;

import java.util.List;

import org.hillel.it.mallspot.persistance.repository.ProductsRepository;


public class Store extends BaseEntity{
	private String name;
	private String description;
	private String position;
	private Mall mall;
	private User storeAdmin;
	private String category;//what it sells
	private ProductsRepository products;
	
	public Store( String name, String description,
			 String position, Mall mall, User storeAdmin) {
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
	public boolean storeAdminEquals(User user){
		return user.equals(storeAdmin);
	}
	
	public List<Product> getProducts() {
		return products.getAllProducts();
	}
	public void setProducts(ProductsRepository products) {
		this.products = products;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
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
	
	
}
