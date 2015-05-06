package org.hillel.it.mallspot.persistance.repository;

import java.util.List;

import org.hillel.it.mallspot.model.entity.Brand;
import org.hillel.it.mallspot.model.entity.Category;
import org.hillel.it.mallspot.model.entity.Mall;
import org.hillel.it.mallspot.model.entity.Product;
import org.hillel.it.mallspot.model.entity.Store;

public interface ProductsRepository {
	List<Product> getProductsByName(String name);
	boolean addProduct(Product product);
	boolean removeProduct(Product product);
	List<Product> getProductsWithTags(List<Category> category);
	List<Product> getProductsByStore(Store store);
	List<Product> getProductsByMall(Mall mall);
	List<Product> getProductsByBrand(Brand brand);

}
