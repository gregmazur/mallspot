package org.hillel.it.mallspot.persistance.repository;

import java.util.ArrayList;

import org.hillel.it.mallspot.model.entity.Mall;
import org.hillel.it.mallspot.model.entity.Store;

public interface StoreRepository {
ArrayList<Store> getAllStores();
ArrayList<Store> getStoresByMall(Mall mall);
void createStore(Store store);
void removeStore(Store store);


}
