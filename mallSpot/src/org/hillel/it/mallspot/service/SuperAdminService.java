package org.hillel.it.mallspot.service;

import org.hillel.it.mallspot.model.entity.Mall;
import org.hillel.it.mallspot.model.entity.Order;
import org.hillel.it.mallspot.model.entity.Store;
import org.hillel.it.mallspot.model.entity.User;

public interface SuperAdminService extends ServiceView {
	User loginAsSU(String name, String password);

	boolean logout();

	Order seeOrders();

	boolean createStore(Store store, Mall mall);

	boolean updateStore();
	
	boolean removeStore(Store store);

}
