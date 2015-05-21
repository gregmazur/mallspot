package org.hillel.it.mallspot.service;

import java.util.List;

import org.hillel.it.mallspot.model.entity.Mall;
import org.hillel.it.mallspot.model.entity.Product;
import org.hillel.it.mallspot.model.entity.SearchCriteria;
import org.hillel.it.mallspot.model.entity.Store;

public interface ServiceView {
	List<Store> getStoresInMall(Mall mall);

	List<Product> getProductsOfTheStore(Store store);
	
	List<Product> getAllProducts();

	List<Product> getProductsByCriterea(SearchCriteria criteria);

	List<Product> getProductsBySeachCriteria(SearchCriteria criteria,
			Store store);
	List<Product> getProductsBySeachCriteria(SearchCriteria criteria,
			Mall mall);
}
