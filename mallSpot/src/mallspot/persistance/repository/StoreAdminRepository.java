package mallspot.persistance.repository;

import mallspot.model.entity.Store;
import mallspot.model.entity.User;


public interface StoreAdminRepository {

	boolean addStoreAdmin(String name,String login, String password);

	boolean removeStoreFromAdmin(User user, Store store);
	
	User loginAsStoreAdmin(String login, String password);
	
	boolean logout(User user);
	
	

}
