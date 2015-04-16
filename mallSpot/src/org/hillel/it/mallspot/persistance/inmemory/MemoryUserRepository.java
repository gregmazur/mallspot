package org.hillel.it.mallspot.persistance.inmemory;

import java.util.ArrayList;
import java.util.List;

import org.hillel.it.mallspot.model.entity.Mall;
import org.hillel.it.mallspot.model.entity.Store;
import org.hillel.it.mallspot.model.entity.User;
import org.hillel.it.mallspot.persistance.repository.StoreAdminRepository;
import org.hillel.it.mallspot.persistance.repository.UserRepository;

public class MemoryUserRepository implements UserRepository,
		StoreAdminRepository {
	List<User> users = new ArrayList<User>();
	List<User> storeAdmins = new ArrayList<User>();

	@Override
	public User getUserByLogin(String login) {
		for (User storeAdmin : storeAdmins) {
			if (storeAdmin.loginEquals(login)) {
				return storeAdmin;
			}
		}
		for (User user : users) {
			if (user.loginEquals(login)) {
				return user;
			}
		}
		return null;
	}

	@Override
	public User getUserByLoginAndPassword(String login, String password) {
		User user = getUserByLogin(login);
		if (user != null && user.passwordEquals(password)) {
			return user;
		}
		return null;
	}

	@Override
	public void insertUser(User user) {
		if (getUserByLogin(user.getLogin()) == null) {
			users.add(user);
		}
	}
	@Override
	public void insertStoreAdmin(User user) {
		if (getUserByLogin(user.getLogin()) == null) {
			storeAdmins.add(user);
		}		
	}

	@Override
	public void updateUser(User user, String login, String password) {
		User userRem = getUserByLoginAndPassword(login, password);
		if (userRem != null && userRem.passwordEquals(password)) {
			users.remove(userRem);
			users.add(user);
		}
	}

	public int usersSize() {
		return users.size();
	}

	@Override
	public void removeUser(String login, String password) {
		User user = getUserByLoginAndPassword(login, password);
		if (user != null && user.passwordEquals(password)) {
			users.remove(user);
		}
	}

	@Override
	public ArrayList<Store> getStores(String login) {
		if (storeAdmins.isEmpty()) {
			return null;
		}
		for (User user : storeAdmins) {
			if (user.loginEquals(login)) {
				return user.getStores();
			}
		}
		return null;
	}

	@Override
	public void getStoresByMall(String login, Mall mall) {
		if (storeAdmins.isEmpty()) {
			return;
		}

	}

}
