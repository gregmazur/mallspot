package org.hillel.it.mallspot.model.entity;

public enum UserType {
	ADMINISTRATOR("Administrator"), 
	STOREADMIN("STOREADMIN"), 
	USER("User");
	private final String type;
	private Store store;
	

	private UserType(String type) {
		this.type = type;
	}
	public boolean equalsType(String group) {
		return (group == null) ? false : group.equals(group);
	}

}
