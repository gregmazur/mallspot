package org.hillel.it.mallspot.persistance.repository;

import java.util.List;

import org.hillel.it.mallspot.model.entity.Brand;
import org.hillel.it.mallspot.model.entity.Product;

public interface ProductsRepository {
	List<Product> getProductsByName(String name);

	boolean addProduct(Product product);

	boolean removeProduct(Product product);

	List<Product> getProductsByBrand(Brand brand);

	List<Product> getProductsByPrice(float priceFrom);

	List<Product> getProductsByPrice(float priceFrom, float priceMax);

	List<Product> getProductsWithTags(String category);

	

}
