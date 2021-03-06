package mallspot.model.entity;

import java.io.Serializable;





public class User extends BaseEntity implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2499114778833236811L;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private UserType userType;
	
	public User(String name,String email, String password, UserType userType) {
		super();
		this.firstName = name;
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

	

}
