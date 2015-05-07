package org.hillel.it.mallspot.service;

import java.util.List;

import org.hillel.it.mallspot.model.entity.Mall;
import org.hillel.it.mallspot.model.entity.Product;
import org.hillel.it.mallspot.model.entity.Store;

public interface UserService {
	List<Product> findProductByName(String name);

	List<Store> getStoresInMall(Mall mall);

	List<Product> getProductsOfTheStore(Store store);

	List<Product> getProductsByPrice(float priceFrom);

	List<Product> getProductsByPrice(float priceFrom, float priceMax);

	List<Product> getProductsByTag(String tag);

	List<Product> getProductsByStore(float priceFrom, float priceMax,
			Store store);

	List<Product> getProductsByStore(float priceFrom, Store store);

	List<Product> getProductsByStore(Store store);

	List<Product> getProductsByStore(Store store, String tag);

	List<Product> getProductsByStore(float priceFrom, float priceMax,
			Store store, String tag);

	List<Product> getProductsByStore(float priceFrom, Store store, String tag);
	
	boolean makeOrder

}
