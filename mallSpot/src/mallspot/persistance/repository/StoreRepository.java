package mallspot.persistance.repository;

import java.util.List;

import mallspot.model.entity.Mall;
import mallspot.model.entity.Store;

public interface StoreRepository {
	List<Store> getStoresByMall(Mall mall);
	
	List<Store> getAllStores();
	
	boolean addStore(Mall mall);
	
	boolean removeStore(Store store);

}
