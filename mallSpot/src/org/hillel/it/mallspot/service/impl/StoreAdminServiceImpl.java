package org.hillel.it.mallspot.service.impl;

import java.util.List;

import org.hillel.it.mallspot.model.entity.Mall;
import org.hillel.it.mallspot.model.entity.Order;
import org.hillel.it.mallspot.model.entity.Product;
import org.hillel.it.mallspot.model.entity.SearchCriteria;
import org.hillel.it.mallspot.model.entity.Store;
import org.hillel.it.mallspot.model.entity.User;
import org.hillel.it.mallspot.persistance.repository.StoreAdminRepository;
import org.hillel.it.mallspot.service.StoreAdminService;

public class StoreAdminServiceImpl implements StoreAdminService {
	StoreAdminRepository storeAdm;
	
	
	@Override
	public boolean createStore(Store store, Mall mall) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public List<Store> getStoresInMall(Mall mall) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getProductsOfTheStore(Store store) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getProductsByCriterea(SearchCriteria criteria) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getProductsBySeachCriteria(SearchCriteria criteria,
			Store store) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getProductsBySeachCriteria(SearchCriteria criteria,
			Mall mall) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean logout() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User loginAsStoreAdmin(String login, String password) {
		return storeAdm.loginAsStoreAdmin(login, password);
	}

	@Override
	public Order seeOrders() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateStore(User user, Store store) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean signUp(String name, String login, String password) {
		return storeAdm.addStoreAdmin(name, login, password);
	}

}
