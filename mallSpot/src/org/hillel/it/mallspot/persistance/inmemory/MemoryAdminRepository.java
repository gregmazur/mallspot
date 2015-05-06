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
	public String updateUser(User user, String login, String password) {
		if (removeUser(login, password)) {
			admins.add(user);
			return "Updated";
		}
		return "Error";
	}

	public int usersSize() {
		return admins.size();
	}

	@Override
	public boolean removeUser(String login, String password) {
		User user = getUserByLoginAndPassword(login, password);
		if (user != null) {
			return admins.remove(user);

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

	

}
