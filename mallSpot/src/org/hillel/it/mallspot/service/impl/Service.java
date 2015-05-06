package org.hillel.it.mallspot.service.impl;

import java.util.ArrayList;

import org.hillel.it.mallspot.model.entity.Product;
import org.hillel.it.mallspot.model.entity.Store;
import org.hillel.it.mallspot.model.entity.User;
import org.hillel.it.mallspot.model.entity.UserType;
import org.hillel.it.mallspot.persistance.inmemory.MemoryUserRepository;
import org.hillel.it.mallspot.service.MallSpotService;
import org.hillel.it.mallspot.service.MallSpotStoreAdminService;

public class Service implements MallSpotService, MallSpotStoreAdminService {
	private MemoryUserRepository memoryUserRepository;

	@Override
	public void registration(String login, String password, String firstname,
			String lastname, UserType usertype, String email) {
		if (usertype.equalsType("Administrator")) {
			return;
		}
		User user = new User(firstname, lastname, usertype, login, email, password);
		if (memoryUserRepository.getUserByLogin(login) != null) {
			if (usertype.equalsType("Storeadmin")) {
				return;
			} else {
				memoryUserRepository.insertUser(user);
			}
		} else {
			System.out.println("The login already exists");
		}
	}

	public User getUser(String login) {
		return memoryUserRepository.getUserByLogin(login);
	}

	public User userEntry(String login, String password) {
		return memoryUserRepository.getUserByLoginAndPassword(login, password);
	}

	public void insertUser(User user) {
		memoryUserRepository.insertUser(user);
	}

	@Override
	public void deleteUser(User user) {
		memoryUserRepository.removeUser(user);

	}

	@Override
	public ArrayList<Store> getListOfStoresAbleToChange(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User hasRightForChanges(User user, Store store) {
		// TODO Auto-generated method stub
		return null;
	}

}
