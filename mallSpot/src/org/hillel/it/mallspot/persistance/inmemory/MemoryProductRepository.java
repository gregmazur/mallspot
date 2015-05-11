package org.hillel.it.mallspot.persistance.inmemory;

import java.util.ArrayList;
import java.util.List;

import org.hillel.it.mallspot.model.entity.Product;
import org.hillel.it.mallspot.model.entity.SearchCriteria;
import org.hillel.it.mallspot.persistance.repository.ProductsRepository;

public class MemoryProductRepository implements ProductsRepository {
	List<Product> products = new ArrayList<Product>();

	@Override
	public List<Product> getProductsByName(String name) {
		List<Product> products = new ArrayList<Product>();
		for (Product product : this.products) {
			if(product.getName().equals(name)){
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
	public boolean updateProduct(Product product, Product updatedProduct) {
		for (int i = 0; i < products.size(); i++) {
			if(products.get(i).equals(product)){
				products.set(i, updatedProduct);
			}
		}
		return false;
	}

	@Override
	public List<Product> searchProducts(SearchCriteria criteria){
		List<Product> products = new ArrayList<Product>();
		for (Product product : this.products) {
			if(product.matchCriteria(criteria)){
				products.add(product);
			}
		}
		return products;
	}

	@Override
	public List<Product> getAllProducts() {
		return products;
	}
	

}
