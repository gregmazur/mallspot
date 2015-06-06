package mallspot.service.impl;

import mallspot.model.entity.Mall;
import mallspot.model.entity.Order;
import mallspot.model.entity.Store;
import mallspot.model.entity.User;
import mallspot.persistance.repository.StoreAdminRepository;
import mallspot.service.StoreAdminService;

public class StoreAdminServiceImpl implements StoreAdminService {
	StoreAdminRepository storeAdm;

	@Override
	public boolean createStore(Store store, Mall mall) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean logout() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User loginAsStoreAdmin(String login, String password) {
		return storeAdm.loginAsStoreAdmin(login, password);
	}

	@Override
	public Order seeOrders() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateStore(User user, Store store) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean signUp(String name, String login, String password) {
		return storeAdm.addStoreAdmin(name, login, password);
	}

}
