package org.hillel.it.mallspot.model.entity;

public class SearchCriteria {
private String name;
private Brand brand;
private String description;
private float priceMin = 0;
private float priceMax = 0;

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
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public float getPriceMin() {
	return priceMin;
}
public void setPriceMin(float priceMin) {
	this.priceMin = priceMin;
}
public float getPriceMax() {
	return priceMax;
}
public void setPriceMax(float priceMax) {
	this.priceMax = priceMax;
}

}
