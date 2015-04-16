package org.hillel.it.mallspot.service;

import java.util.ArrayList;
import org.hillel.it.mallspot.model.entity.Store;
import org.hillel.it.mallspot.model.entity.User;

public interface MallSpotStoreAdminService {
	ArrayList<Store>getListOfStoresAbleToChange(User user);
	User hasRightForChanges(User user, Store store);
	
}
