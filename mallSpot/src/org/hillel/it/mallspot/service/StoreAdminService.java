package org.hillel.it.mallspot.service;

import org.hillel.it.mallspot.model.entity.Mall;
import org.hillel.it.mallspot.model.entity.Store;

public interface StoreAdminService {
boolean createStore(Store store, Mall mall);
boolean updateStore();
}
