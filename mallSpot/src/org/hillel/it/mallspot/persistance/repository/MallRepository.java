package org.hillel.it.mallspot.persistance.repository;

import java.util.List;

import org.hillel.it.mallspot.model.entity.Mall;

public interface MallRepository {
	
	boolean addMall(Mall mall);

	boolean remove(Mall mall);
	
	boolean updateMall(Mall mall);

	List<Mall> getAllMalls();
}
