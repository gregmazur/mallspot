package mallspot.persistance.inmemory;

import java.util.ArrayList;
import java.util.List;

import mallspot.model.entity.Store;
import mallspot.model.entity.User;
import mallspot.model.entity.UserType;
import mallspot.persistance.repository.StoreAdminRepository;


public class MemoryAdminRepository implements StoreAdminRepository {
	List<User> admins = new ArrayList<User>();
	
	public int usersSize() {
		return admins.size();
	}

	public int getUserIndex(String login, String password) {
		for (int i = 0; i < admins.size(); i++) {
			if (admins.get(i).loginEquals(login)
					&& admins.get(i).passwordEquals(password)) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public boolean addStoreAdmin(String name,String login, String password) {
		User admin = new User(name,login,password,UserType.STOREADMIN);
		return admins.add(admin);		
	}

	@Override
	public boolean removeStoreFromAdmin(User user, Store store) {
		
		return false;
	}

	@Override
	public User loginAsStoreAdmin(String login, String password) {
		for (User admin : admins) {
			if(admin.getEmail().equals(login) && admin.equals(password)){
				return admin;
			}
		}
		return null;
	}

	@Override
	public boolean logout(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
