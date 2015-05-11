package org.hillel.it.mallspot.persistance.inmemory;

import java.util.ArrayList;
import java.util.List;

import org.hillel.it.mallspot.model.entity.Store;
import org.hillel.it.mallspot.model.entity.User;
import org.hillel.it.mallspot.persistance.repository.StoreAdminRepository;
import org.hillel.it.mallspot.persistance.repository.UserRepository;

public class MemoryAdminRepository implements StoreAdminRepository,UserRepository {
	List<User> admins = new ArrayList<User>();
	

	@Override
	public User getUserByLogin(String login) {
		for (User user : admins) {
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
	public boolean addUser(User user) {
		if (getUserByLogin(user.getEmail()) == null) {
			admins.add(user);
			return true;
		}
		return false;
	}

	@Override
	public boolean updateUser(User user, String login, String password) {
		int userIndex = getUserIndex(login, password);
		if ( userIndex > 0) {
			admins.set(userIndex,user);
			return true;
		}
		return false;
	}

	public int usersSize() {
		return admins.size();
	}

	@Override
	public boolean removeUser(String login, String password) {
		int userIndex = getUserIndex(login, password);
		if ( userIndex > 0) {
			admins.remove(userIndex);
			return true;
		}
		return false;
	}

	@Override
	public boolean addStoreToAdmin(String login, Store store) {
		return getUserByLogin(login).addStore(store);
		
	}

	@Override
	public boolean removeStoreFromAdmin(String login, Store store) {
		return getUserByLogin(login).removeStore(store);
	}

	public int getUserIndex(String login, String password) {
		for (int i = 0; i < admins.size(); i++) {
			if (admins.get(i).loginEquals(login)
					&& admins.get(i).passwordEquals(password)) {
				return i;
			}
		}
		return -1;
	}

}
