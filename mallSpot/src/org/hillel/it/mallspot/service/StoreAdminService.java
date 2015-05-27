package org.hillel.it.mallspot.service;


import org.hillel.it.mallspot.model.entity.Mall;
import org.hillel.it.mallspot.model.entity.Order;
import org.hillel.it.mallspot.model.entity.Store;
import org.hillel.it.mallspot.model.entity.User;

public interface StoreAdminService {
	
	User loginAsStoreAdmin(String name, String password);
	
	boolean logout();
	
	boolean signUp(String name, String login, String password);
	
	Order seeOrders();

	boolean createStore(Store store, Mall mall);

	boolean updateStore(User user, Store store);

}
