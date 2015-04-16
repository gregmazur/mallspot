package org.hillel.it.mallspot.persistance.repository;

import org.hillel.it.mallspot.model.entity.User;

public interface UserRepository {

	User getUserByLogin(String login);

	User getUserByLoginAndPassword(String login, String password);

	void insertUser(User user);

	void updateUser(User user, String login, String password);

	void removeUser(String login, String password);

	

}
