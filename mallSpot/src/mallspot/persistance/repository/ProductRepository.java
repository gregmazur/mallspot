package mallspot.persistance.repository;

import java.util.List;

import mallspot.model.entity.Mall;
import mallspot.model.entity.Product;
import mallspot.model.entity.SearchCriteria;
import mallspot.model.entity.Store;

public interface ProductRepository {
	List<Product> getProductsByCriterea(SearchCriteria criteria);

	List<Product> getProductsBySeachCriteria(SearchCriteria criteria,
			Store store);

	List<Product> getProductsBySeachCriteria(SearchCriteria criteria, Mall mall);

	boolean addProduct(Product product);
	
	boolean removeProduct(Product product);
	
	boolean updateProduct(Product product);
}
