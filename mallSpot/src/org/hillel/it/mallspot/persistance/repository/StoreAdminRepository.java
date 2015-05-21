package org.hillel.it.mallspot.persistance.repository;

import org.hillel.it.mallspot.model.entity.Store;
import org.hillel.it.mallspot.model.entity.User;


public interface StoreAdminRepository {

	boolean addStoreAdmin(String name,String login, String password);

	boolean removeStoreFromAdmin(User user, Store store);
	
	User loginAsStoreAdmin(String login, String password);
	
	boolean logout(User user);
	
	

}
