package org.hillel.it.mallspot.service.impl;

import java.util.List;

import org.hillel.it.mallspot.model.entity.Cart;
import org.hillel.it.mallspot.model.entity.Mall;
import org.hillel.it.mallspot.model.entity.Order;
import org.hillel.it.mallspot.model.entity.Product;
import org.hillel.it.mallspot.model.entity.SearchCriteria;
import org.hillel.it.mallspot.model.entity.Store;
import org.hillel.it.mallspot.model.entity.User;
import org.hillel.it.mallspot.service.UserService;
import org.hillel.it.mallspot.service.StoreAdminService;

public class StoreAdminServiceImpl implements UserService, StoreAdminService {

	@Override
	public boolean createStore(Store store, Mall mall) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateStore() {
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
	public boolean makeOrder(Cart cart) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User login(String name, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean logout() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean signUp(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Order> seeOrders(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean changeOrder(Order order, Order changedOrder) {
		// TODO Auto-generated method stub
		return false;
	}

}
