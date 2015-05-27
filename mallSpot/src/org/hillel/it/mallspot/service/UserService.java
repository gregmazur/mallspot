package org.hillel.it.mallspot.service;

import java.util.List;

import org.hillel.it.mallspot.model.entity.Order;
import org.hillel.it.mallspot.model.entity.User;

public interface UserService {
	
	Order makeOrder(Order order);

	User login(String name, String password);

	boolean logout();

	boolean signUp(String name, String email, String password);
	
	List<Order> seeOrders(User user);
	
	boolean changeOrder(Order order, Order changedOrder);
}
