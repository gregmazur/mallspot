package org.hillel.it.mallspot.persistance.repository;

import java.util.List;

import org.hillel.it.mallspot.model.entity.Mall;
import org.hillel.it.mallspot.model.entity.Product;
import org.hillel.it.mallspot.model.entity.SearchCriteria;
import org.hillel.it.mallspot.model.entity.Store;

public interface ProductRepository {
	List<Product> getProductsByCriterea(SearchCriteria criteria);

	List<Product> getProductsBySeachCriteria(SearchCriteria criteria,
			Store store);

	List<Product> getProductsBySeachCriteria(SearchCriteria criteria, Mall mall);

	boolean addProduct(Product product);
	
	boolean removeProduct(Product product);
	
	boolean updateProduct(Product product);
}
