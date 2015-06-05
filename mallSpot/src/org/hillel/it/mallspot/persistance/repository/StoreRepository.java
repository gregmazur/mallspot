package org.hillel.it.mallspot.persistance.repository;

import java.util.List;

import org.hillel.it.mallspot.model.entity.Mall;
import org.hillel.it.mallspot.model.entity.Store;

public interface StoreRepository {
	List<Store> getStoresByMall(Mall mall);
	
	List<Store> getAllStores();
	
	boolean addStore(Mall mall);
	
	boolean removeStore(Store store);

}
