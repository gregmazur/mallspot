package mallspot.service;


import mallspot.model.entity.Mall;
import mallspot.model.entity.Order;
import mallspot.model.entity.Store;
import mallspot.model.entity.User;

public interface StoreAdminService {
	
	User loginAsStoreAdmin(String name, String password);
	
	boolean logout();
	
	boolean signUp(String name, String login, String password);
	
	Order seeOrders();

	boolean createStore(Store store, Mall mall);

	boolean updateStore(User user, Store store);

}
