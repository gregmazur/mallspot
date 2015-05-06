package org.hillel.it.mallspot.persistance.inmemory;

import java.util.ArrayList;
import java.util.List;

import org.hillel.it.mallspot.model.entity.Brand;
import org.hillel.it.mallspot.model.entity.Category;
import org.hillel.it.mallspot.model.entity.Mall;
import org.hillel.it.mallspot.model.entity.Product;
import org.hillel.it.mallspot.model.entity.Store;
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
	public List<Product> getProductsWithTags(List<Category> category) {
		List<Product> products = new ArrayList<Product>();
		for (Product product : this.products) {
			if(product.getDescription().contains(category.toString())){
				products.add(product);
			}
		}
		return products;
	}

	@Override
	public List<Product> getProductsByStore(Store store) {
		List<Product> products = new ArrayList<Product>();
		for (Product product : this.products) {
			if(product..contains(category.toString())){
				products.add(product);
			}
		}
		return products;
	}

	@Override
	public List<Product> getProductsByMall(Mall mall) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getProductsByBrand(Brand brand) {
		// TODO Auto-generated method stub
		return null;
	}

}
