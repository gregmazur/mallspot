package mallspot.service;

import mallspot.model.entity.Mall;
import mallspot.model.entity.Order;
import mallspot.model.entity.Store;
import mallspot.model.entity.User;

public interface SuperAdminService extends ServiceView {
	User loginAsSU(String name, String password);

	boolean logout();

	Order seeOrders();

	boolean createStore(Store store, Mall mall);

	boolean updateStore();
	
	boolean removeStore(Store store);

}
