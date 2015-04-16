package org.hillel.it.mallspot.model.entity;

import java.util.ArrayList;

public  class User {
	

	private String firstName;
	private String lastName;
	private String login;
	private String email;
	private String password;
	private UserType userType;
	private ArrayList<Store> stores;
	
	
	public User(String login, String password, UserType userType, String firstName,
			String lastName,  String email ) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.login = login;
		this.email = email;
		this.password = password;
		this.userType = userType;
	}
	public User(){
		
	}
	
	public boolean loginEquals(String login){
		return this.login.equalsIgnoreCase(login)? true: false;
	}
	public boolean passwordEquals(String password){
		return this.password.equalsIgnoreCase(password)?true:false;
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
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
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


}
