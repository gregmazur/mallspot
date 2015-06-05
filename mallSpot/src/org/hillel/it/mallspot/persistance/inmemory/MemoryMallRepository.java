package org.hillel.it.mallspot.persistance.inmemory;

import java.util.ArrayList;
import java.util.List;

import org.hillel.it.mallspot.model.entity.Mall;
import org.hillel.it.mallspot.persistance.repository.MallRepository;

public class MemoryMallRepository implements MallRepository{
List<Mall> malls = new ArrayList<Mall>();
	
	@Override
	public boolean addMall(Mall mall) {
		return malls.add(mall);
	}
	@Override
	public boolean remove(Mall mall) {
		return malls.remove(mall);
	}
	@Override
	public List<Mall> getAllMalls() {
		return malls;
	}
	@Override
	public boolean updateMall(Mall mall) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
