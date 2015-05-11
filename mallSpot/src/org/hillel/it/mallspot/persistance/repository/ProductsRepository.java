package org.hillel.it.mallspot.persistance.repository;

import java.util.List;

import org.hillel.it.mallspot.model.entity.Product;
import org.hillel.it.mallspot.model.entity.SearchCriteria;

public interface ProductsRepository {
	List<Product> getProductsByName(String name);

	boolean addProduct(Product product);

	boolean removeProduct(Product product);
	
	boolean updateProduct(Product product, Product updatedProduct);

	List<Product> searchProducts(SearchCriteria criteria);
	
	List<Product> getAllProducts();
	
}
