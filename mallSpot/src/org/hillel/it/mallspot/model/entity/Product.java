package org.hillel.it.mallspot.model.entity;



public class Product extends BaseEntity{
	private byte[] image;
	private float price;
	private String description;// categories(tag) are being saved here 
	private String name;
	private Brand brand;
	private long storeId; //specifies store to which the product belongs
	
	
	
	public Product(String name, float price, String description, 
			Brand brand) {
		super();
		this.price = price;
		this.description = description;
		this.name = name;
		this.brand = brand;
	}
	
	public boolean matchCriteria(SearchCriteria criteria){
		if (criteria.getName() != null){
			if(!name.contains(criteria.getName()));
			return false;
		}
		if(criteria.getBrand() != null){
			if(!brand.equals(criteria.getBrand()));
			return false;
		}
		if(criteria.getDescription() != null){
			if(!description.contains(criteria.getDescription())){
				return false;
			}
		}
		if(criteria.getPriceMin() > 0){
			if(price < criteria.getPriceMin()){
				return false;
			}
		}
		if(criteria.getPriceMax() > 0){
			if(price > criteria.getPriceMax()){
				return false;
			}
		}
		return true;
	}
	
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public long getStoreId() {
		return storeId;
	}

	public void setStoreId(long id) {
		this.storeId = id;
	}
	
	
	
}
