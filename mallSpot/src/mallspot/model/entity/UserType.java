package mallspot.model.entity;

public enum UserType {
	SUPERADMIN("SUPERADMIN"), 
	STOREADMIN("STOREADMIN"), 
	USER("USER");
	private final String type;


	private UserType(String type) {
		this.type = type;
	}
	public boolean equalsType(String group) {
		return (group == null) ? false : group.equals(group);
	}

}
