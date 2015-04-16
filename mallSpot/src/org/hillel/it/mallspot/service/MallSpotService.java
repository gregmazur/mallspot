package org.hillel.it.mallspot.service;

import org.hillel.it.mallspot.model.entity.User;
import org.hillel.it.mallspot.model.entity.UserType;

public interface MallSpotService {
	void registration(String login, String password, String firstname,
			String lastname, UserType usertype, String email);

	void insertUser(User user);

	User getUser(String login);

	User userEntry(String login, String password);

	void deleteUser(User user);
}
