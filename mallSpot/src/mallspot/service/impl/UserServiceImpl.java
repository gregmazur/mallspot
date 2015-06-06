package mallspot.service.impl;

import java.io.Serializable;
import java.util.List;

import mallspot.model.entity.Order;
import mallspot.model.entity.User;
import mallspot.model.entity.UserType;
import mallspot.persistance.repository.OrderRepository;
import mallspot.persistance.repository.UserRepository;
import mallspot.service.UserService;

public class UserServiceImpl extends ServiceViewImpl implements UserService,Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -250138080739387303L;
	
	private UserRepository userRep;
	private OrderRepository orderRep;
	
	public UserServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public Order makeOrder(Order order) {
		// TODO Auto-generated method stub
		return null;
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
	public List<Order> seeOrders(User user) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean changeOrder(Order order, Order changedOrder) {
		// TODO Auto-generated method stub
		return false;
	}
	public UserRepository getUserRep() {
		return userRep;
	}
	public void setUserRep(UserRepository userRep) {
		this.userRep = userRep;
	}
	public OrderRepository getOrderRep() {
		return orderRep;
	}
	public void setOrderRep(OrderRepository orderRep) {
		this.orderRep = orderRep;
	}



}
