package org.hillel.it.mallspot.persistance.repository;

import java.util.List;

import org.hillel.it.mallspot.model.entity.Mall;
import org.hillel.it.mallspot.model.entity.Product;
import org.hillel.it.mallspot.model.entity.Store;
import org.hillel.it.mallspot.model.entity.User;

public interface StoreRepository {
	List<Store> getAllStores();

	List<Store> getStoresByMall(Mall mall);

	boolean createStore(Store store);

	boolean removeStore(Store store);

	List<Store> getStoresWithThisProduct(Product product);

	List<Store> getStoresByStoreAdmin(User user);

	List<Store> getStoresByCategory(String category);

	boolean addProductToStore(Store store, Product product);

	boolean removeProductFromStore(Store store, Product product);

	List<Product> getAllProductsFromStore(Store store);

}
