package org.hillel.it.mallspot.service.impl;

import java.util.List;

import org.hillel.it.mallspot.model.entity.Mall;
import org.hillel.it.mallspot.model.entity.Product;
import org.hillel.it.mallspot.model.entity.SearchCriteria;
import org.hillel.it.mallspot.model.entity.Store;
import org.hillel.it.mallspot.persistance.inmemory.MemoryMallRepository;
import org.hillel.it.mallspot.service.ServiceView;

public class ServiceViewImpl implements ServiceView{
private MemoryMallRepository mallRep;
	
	@Override
	public List<Store> getStoresInMall(Mall mall) {
		return mallRep.getStoresByMall(mall);
	}

	@Override
	public List<Product> getProductsOfTheStore(Store store) {
		return mallRep.getProductsBySeachCriteria(null, store);
	}

	@Override
	public List<Product> getAllProducts() {
		return mallRep.getAllProducts();
	}

	@Override
	public List<Product> searchProductsByCriterea(SearchCriteria criteria) {
		return mallRep.getProductsByCriterea(criteria);
	}

	@Override
	public List<Product> searchProductsBySeachCriteria(SearchCriteria criteria,
			Store store) {
		return mallRep.getProductsBySeachCriteria(criteria, store);
	}

	@Override
	public List<Product> searchProductsBySeachCriteria(SearchCriteria criteria,
			Mall mall) {
		return mallRep.getProductsBySeachCriteria(criteria, mall);
	}

}
