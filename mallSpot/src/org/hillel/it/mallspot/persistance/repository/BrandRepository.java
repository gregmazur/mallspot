package org.hillel.it.mallspot.persistance.repository;

import java.util.List;

import org.hillel.it.mallspot.model.entity.Brand;

public interface BrandRepository {

	List<Brand> getBrandByName(String name);

	boolean addBrand(Brand brand);

	boolean removeBrand(Brand brand);
	
	List<Brand> getAllBrands();

}
