package mallspot.service.impl;

import java.util.List;

import mallspot.model.entity.Mall;
import mallspot.model.entity.Product;
import mallspot.model.entity.SearchCriteria;
import mallspot.model.entity.Store;
import mallspot.persistance.inmemory.MemoryMallRepository;
import mallspot.service.ServiceView;

public class ServiceViewImpl implements ServiceView{
private MemoryMallRepository mallRep;

@Override
public List<Store> getStoresInMall(Mall mall) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public List<Product> getProductsOfTheStore(Store store) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public List<Product> getAllProducts() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public List<Product> searchProductsByCriterea(SearchCriteria criteria) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public List<Product> searchProductsBySeachCriteria(SearchCriteria criteria,
		Store store) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public List<Product> searchProductsBySeachCriteria(SearchCriteria criteria,
		Mall mall) {
	// TODO Auto-generated method stub
	return null;
}
	
	
	

}
