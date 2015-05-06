package org.hillel.it.mallspot.persistance.inmemory;

import java.util.ArrayList;
import java.util.List;
import org.hillel.it.mallspot.model.entity.User;
import org.hillel.it.mallspot.persistance.repository.UserRepository;

public class MemoryUserRepository implements UserRepository {
	List<User> users = new ArrayList<User>();

	@Override
	public User getUserByLogin(String login) {
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
	public boolean addUser(User user) {
		if (getUserByLogin(user.getEmail()) == null) {
			users.add(user);
			return true;
		}
		return false;
	}

	@Override
	public String updateUser(User user, String login, String password) {
		if (removeUser(login, password)) {
			users.add(user);
			return "Updated";
		}
		return "Error";
	}

	public int usersSize() {
		return users.size();
	}

	@Override
	public boolean removeUser(String login, String password) {
		User user = getUserByLoginAndPassword(login, password);
		if (user != null) {
			return users.remove(user);

		}
		return false;
	}

}
