package mallspot.service;

import java.util.List;

import mallspot.model.entity.Mall;
import mallspot.model.entity.Product;
import mallspot.model.entity.SearchCriteria;
import mallspot.model.entity.Store;

public interface ServiceView {
	List<Store> getStoresInMall(Mall mall);

	List<Product> getProductsOfTheStore(Store store);
	
	List<Product> getAllProducts();

	List<Product> searchProductsByCriterea(SearchCriteria criteria);

	List<Product> searchProductsBySeachCriteria(SearchCriteria criteria,
			Store store);
	List<Product> searchProductsBySeachCriteria(SearchCriteria criteria,
			Mall mall);
}
