package mallspot.service;

import java.util.List;

import mallspot.model.entity.Order;
import mallspot.model.entity.User;

public interface UserService {
	boolean registration( User user);
	
	Order makeOrder(Order order);

	User login(String name, String password);

	boolean logout();

	List<Order> seeOrders(User user);
	
	boolean changeOrder(Order order, Order changedOrder);
}
