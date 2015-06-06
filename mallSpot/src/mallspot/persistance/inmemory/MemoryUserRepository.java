package mallspot.persistance.inmemory;

import java.util.ArrayList;
import java.util.List;

import mallspot.model.entity.User;
import mallspot.persistance.repository.UserRepository;

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
	public User getUser(String login, String password) {
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
	public boolean updateUser(User user, String login, String password) {
		int userIndex = getUserIndex(login, password);
		if ( userIndex > 0) {
			users.set(userIndex, user);
			return true;
		}
		return false;
	}

	public int usersSize() {
		return users.size();
	}

	@Override
	public boolean removeUser(String login, String password) {
		int userIndex = getUserIndex(login, password);
		if ( userIndex > 0) {
			users.remove(userIndex);
			return true;
		}
		return false;
	}

	public int getUserIndex(String login, String password) {
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).loginEquals(login)
					&& users.get(i).passwordEquals(password)) {
				return i;
			}
		}
		return -1;
	}

}
