package org.hillel.it.mallspot.persistance.repository;

import org.hillel.it.mallspot.model.entity.Store;


public interface StoreAdminRepository {

	boolean addStoreToAdmin(String login, Store store);

	boolean removeStoreFromAdmin(String login, Store store);

}
