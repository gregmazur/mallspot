package org.hillel.it.mallspot.persistance.repository;

import org.hillel.it.mallspot.model.entity.User;

public interface UserRepository {

	User getUserByLogin(String login);

	User getUserByLoginAndPassword(String login, String password);

	boolean addUser(User user);

	String updateUser(User user, String login, String password);

	boolean removeUser(String login, String password);

	

}