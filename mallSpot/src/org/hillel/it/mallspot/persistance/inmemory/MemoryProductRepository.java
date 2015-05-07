package org.hillel.it.mallspot.persistance.inmemory;

import java.util.ArrayList;
import java.util.List;

import org.hillel.it.mallspot.model.entity.Brand;
import org.hillel.it.mallspot.model.entity.Product;
import org.hillel.it.mallspot.persistance.repository.ProductsRepository;

public class MemoryProductRepository implements ProductsRepository {
	List<Product> products = new ArrayList<Product>();

	@Override
	public List<Product> getProductsByName(String name) {
		List<Product> products = new ArrayList<Product>();
		for (Product product : this.products) {
			if(product.getName().contains(name)){
				products.add(product);
			}
		}
		return products;
	}

	@Override
	public boolean addProduct(Product product) {
		return products.add(product);
	}

	@Override
	public boolean removeProduct(Product product) {
		return products.remove(product);
	}

	@Override
	public List<Product> getProductsWithTags(String category) {
		List<Product> products = new ArrayList<Product>();
		for (Product product : this.products) {
			if(product.getDescription().contains(category)){
				products.add(product);
			}
		}
		return products;
	}
	
	@Override
	public List<Product> getProductsByBrand(Brand brand) {
		List<Product> products = new ArrayList<Product>();
		for (Product product : this.products) {
			if(product.getBrand().equals(brand)){
				products.add(product);
			}
		}
		return products;
	}

	@Override
	public List<Product> getProductsByPrice(float priceFrom) {
		List<Product> products = new ArrayList<Product>();
		for (Product product : this.products) {
			if(product.getPrice() > priceFrom){
				products.add(product);
			}
		}
		return products;
	}

	@Override
	public List<Product> getProductsByPrice(float priceFrom, float priceMax) {
		List<Product> products = new ArrayList<Product>();
		for (Product product : this.products) {
			if(product.getPrice() > priceFrom && product.getPrice() < priceMax){
				products.add(product);
			}
		}
		return products;
	}

}
