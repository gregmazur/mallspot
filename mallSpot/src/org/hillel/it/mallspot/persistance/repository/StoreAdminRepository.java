package org.hillel.it.mallspot.persistance.repository;

import java.util.ArrayList;

import org.hillel.it.mallspot.model.entity.Mall;
import org.hillel.it.mallspot.model.entity.Store;
import org.hillel.it.mallspot.model.entity.User;

public interface StoreAdminRepository {
	
	void getStoresByMall(String login, Mall mall);

	void insertStoreAdmin(User user);

	ArrayList<Store> getStores(String login);

}
