package org.hillel.it.mallspot.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections4.ListUtils;
import org.hillel.it.mallspot.model.entity.Mall;
import org.hillel.it.mallspot.model.entity.Order;
import org.hillel.it.mallspot.model.entity.Product;
import org.hillel.it.mallspot.model.entity.SearchCriteria;
import org.hillel.it.mallspot.model.entity.Store;
import org.hillel.it.mallspot.model.entity.User;
import org.hillel.it.mallspot.model.entity.UserType;
import org.hillel.it.mallspot.persistance.repository.MallRepository;
import org.hillel.it.mallspot.persistance.repository.OrderRepository;
import org.hillel.it.mallspot.persistance.repository.UserRepository;
import org.hillel.it.mallspot.service.UserService;

public class UserServiceImpl implements UserService {
	MallRepository mallRep;
	UserRepository userRep;
	OrderRepository orderRep;

	@Override
	public List<Store> getStoresInMall(Mall mall) {
		return mallRep.getStoresByMall(mall);
	}

	@Override
	public List<Product> getProductsOfTheStore(Store store) {
		return store.getProducts();
	}

	@Override
	public List<Product> getProductsByCriterea(SearchCriteria criteria) {
		List<Mall> malls = mallRep.getAllMalls();
		List<Product> products = new ArrayList<Product>();
		for (Mall mall : malls) {
			for (Store store : mall.getStores()) {
				for (Product product : store.getProducts()) {
					if (product.matchCriteria(criteria)) {
						products.add(product);
					}
				}
			}
		}

		return products;
	}

	@Override
	public List<Product> getProductsBySeachCriteria(SearchCriteria criteria,
			Store store) {
		List<Mall> malls = mallRep.getAllMalls();
		List<Product> products = new ArrayList<Product>();
		for (Mall mall : malls) {
			for (Store storeI : mall.getStores()) {
				if (storeI.equals(store)) {
					for (Product product : store.getProducts()) {
						if (product.matchCriteria(criteria)) {
							products.add(product);
						}
					}
					return products;
				}
			}
		}

		return products;
	}

	@Override
	public List<Product> getProductsBySeachCriteria(SearchCriteria criteria,
			Mall mall) {
		List<Product> products = new ArrayList<Product>();
		for (Store store : mallRep.getStoresByMall(mall)) {
			for (Product product : store.getProducts()){
				if(product.matchCriteria(criteria)){
					products.add(product);
				}
			}
		}
		return products;
	}

	@Override
	public Order makeOrder(Order order) {
		return orderRep.addOrder(order);
	}

	@Override
	public User login(String name, String password) {
		return userRep.loginAsUser(name, password);

	}

	@Override
	public boolean logout() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean signUp(String name, String email, String password) {
		User user = new User(name, email, password, UserType.USER);
		return userRep.addUser(user);
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

	@Override
	public List<Product> getAllProducts() {
		List<Mall> malls = mallRep.getAllMalls();
		List<Product> products = new ArrayList<Product>();
		for (Mall mall : malls) {
			for (Store store : mall.getStores()) {
				products = ListUtils.sum(products, store.getProducts());
			}
		}

		return products;
	}

}
