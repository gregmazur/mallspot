package org.hillel.it.mallspot.service.impl;

import java.util.ArrayList;
import java.util.List;


import org.apache.commons.collections4.ListUtils;
import org.hillel.it.mallspot.model.entity.Cart;
import org.hillel.it.mallspot.model.entity.Mall;
import org.hillel.it.mallspot.model.entity.Order;
import org.hillel.it.mallspot.model.entity.Product;
import org.hillel.it.mallspot.model.entity.SearchCriteria;
import org.hillel.it.mallspot.model.entity.Store;
import org.hillel.it.mallspot.model.entity.User;
import org.hillel.it.mallspot.persistance.repository.MallRepository;
import org.hillel.it.mallspot.persistance.repository.OrderRepository;
import org.hillel.it.mallspot.persistance.repository.UserRepository;
import org.hillel.it.mallspot.service.UserService;

public class UserServiceImpl  implements UserService{
	MallRepository mallRep;
	UserRepository userRep;
	OrderRepository orderRep;
	
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
	public List<Product> getProductsByCriterea(SearchCriteria criteria) {
		List<Mall> malls = mallRep.getAllMalls();
		List<Product> products = new ArrayList<Product>();
		for (Mall mall : malls) {
			for (Store store : mall.getStores()) {
				products = ListUtils.sum(products, store.getProducts());
			}
		}
		
		return products;
	}
	@Override
	public List<Product> getProductsByStore(SearchCriteria criteria, Store store) {
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
	

	

}
