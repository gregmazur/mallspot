package org.hillel.it.mallspot.persistance.inmemory;

import java.util.ArrayList;
import java.util.List;

import org.hillel.it.mallspot.model.entity.Mall;
import org.hillel.it.mallspot.model.entity.Product;
import org.hillel.it.mallspot.model.entity.Store;
import org.hillel.it.mallspot.model.entity.User;
import org.hillel.it.mallspot.persistance.repository.StoreRepository;

public class MemoryStoreRepository implements StoreRepository{
	private List <Store> stores = new ArrayList<Store>();

	@Override
	public List<Store> getAllStores() {
		return stores;
	}

	@Override
	public List<Store> getStoresByMall(Mall mall) {
		List<Store> stores = new ArrayList<>();
		for (Store store : this.stores) {
			if(store.mallEquals(mall)){
				stores.add(store);
			}
		}
		return stores;
	}

	@Override
	public boolean removeStore(Store store) {
		return stores.remove(store);
	}

	@Override
	public boolean createStore(Store store) {
		return stores.add(store);
	}

	@Override
	public List<Store> getStoresWithThisProduct(Product product) {
		List<Store> stores = new ArrayList<>();
		for (Store store : this.stores) {
			if(store.containsProduct(product)){
				stores.add(store);
			}
		}
		return stores;
	}

	@Override
	public List<Store> getStoresByStoreAdmin(User user) {
		List<Store> stores = new ArrayList<>();
		for (Store store : this.stores) {
			if(store.storeAdminEquals(user)){
			stores.add(store);
			}
		}
		return stores;
	}

	@Override
	public List<Store> getStoresByCategory(String category) {
		List<Store> stores = new ArrayList<>();
		for (Store store : this.stores) {
			if(store.getCategory().equals(category)){
			stores.add(store);
			}
		}
		return stores;
		
	}

	@Override
	public boolean addProductToStore(Store store, Product product) {
		for (Store storeI : stores) {
			if(store.equals(storeI)){
				storeI.addProduct(product);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean removeProductFromStore(Store store, Product product) {
		for (Store storeI : stores) {
			if(store.equals(storeI)){
				storeI.removeProduct(product);
				return true;
			}
		}
		return false;
	}

	@Override
	public List<Product> getAllProductsFromStore(Store store) {
		List<Product> products = new ArrayList<>();
		for (Store storeI : stores) {
			if(store.equals(storeI)){
			stores.add(store);
			}
		}
		return products;
	}
	
	

}
