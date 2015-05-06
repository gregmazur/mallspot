package org.hillel.it.mallspot.model.entity;

import java.util.ArrayList;

public class User {

	private long userId;
	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private UserType userType;
	private ArrayList<Store> stores;

	public User(String email, String password, UserType userType) {
		super();
		this.email = email;
		this.password = password;
		this.userType = userType;
	}

	public User() {

	}

	public boolean loginEquals(String login) {
		return this.email.equalsIgnoreCase(login) ? true : false;
	}

	public boolean passwordEquals(String password) {
		return this.password.equalsIgnoreCase(password) ? true : false;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	public ArrayList<Store> getStores() {
		return stores;
	}

	public void setStores(ArrayList<Store> stores) {
		this.stores = stores;
	}

	public boolean addStore(Store store) {
		return stores.add(store);
	}

	public boolean removeStore(Store store) {
		return stores.remove(store);
	}

}
