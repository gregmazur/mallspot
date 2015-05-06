package org.hillel.it.mallspot.persistance.repository;

import java.util.List;

import org.hillel.it.mallspot.model.entity.Mall;
import org.hillel.it.mallspot.model.entity.Store;

public interface MallRepository {
	List<Store> getStoresByMall(Mall mall);
	boolean addMall(Mall mall);
	boolean remove(Mall mall);
	List<Mall> getAllMalls();

}
