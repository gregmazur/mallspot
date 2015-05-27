package org.hillel.it.mallspot.service.impl;

import java.util.List;

import org.hillel.it.mallspot.model.entity.Order;
import org.hillel.it.mallspot.model.entity.User;
import org.hillel.it.mallspot.model.entity.UserType;
import org.hillel.it.mallspot.persistance.repository.OrderRepository;
import org.hillel.it.mallspot.persistance.repository.UserRepository;
import org.hillel.it.mallspot.service.UserService;

public class UserServiceImpl extends ServiceViewImpl implements UserService {
	UserRepository userRep;
	OrderRepository orderRep;

	

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

	

}
