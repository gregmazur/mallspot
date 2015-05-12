package org.hillel.it.mallspot.service;

import java.util.List;

import org.hillel.it.mallspot.model.entity.Cart;
import org.hillel.it.mallspot.model.entity.Mall;
import org.hillel.it.mallspot.model.entity.Order;
import org.hillel.it.mallspot.model.entity.Product;
import org.hillel.it.mallspot.model.entity.SearchCriteria;
import org.hillel.it.mallspot.model.entity.Store;
import org.hillel.it.mallspot.model.entity.User;

public interface UserService {
	
	List<Store> getStoresInMall(Mall mall);

	List<Product> getProductsOfTheStore(Store store);
	
	List<Product> getAllProducts();

	List<Product> getProductsByCriterea(SearchCriteria criteria);

	List<Product> getProductsBySeachCriteria(SearchCriteria criteria,
			Store store);
	List<Product> getProductsBySeachCriteria(SearchCriteria criteria,
			Mall mall);
	
	boolean makeOrder(Cart cart);

	User login(String name, String password);

	boolean logout();

	boolean signUp(User user);
	
	List<Order> seeOrders(User user);
	
	boolean changeOrder(Order order, Order changedOrder);
}
