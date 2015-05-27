package org.hillel.it.mallspot.persistance.inmemory;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections4.ListUtils;
import org.hillel.it.mallspot.model.entity.Mall;
import org.hillel.it.mallspot.model.entity.Product;
import org.hillel.it.mallspot.model.entity.SearchCriteria;
import org.hillel.it.mallspot.model.entity.Store;
import org.hillel.it.mallspot.persistance.repository.MallRepository;

public class MemoryMallRepository implements MallRepository{
List<Mall> malls = new ArrayList<Mall>();
	@Override
	public List<Store> getStoresByMall(Mall mall) {
		for (Mall mallI : malls) {
			if(mall.equals(mallI)){
				return mall.getStores();
			}
		}
		return null;
	}
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
	public List<Product> getProductsByCriterea(SearchCriteria criteria) {
		List<Product> products = new ArrayList<Product>();
		for (Mall mall : malls) {
			for (Store store : mall.getStores()) {
				for (Product product : store.getProducts()) {
					if (product.matchCriteria(criteria)) {
						products.add(product);
					}
				}
			}
		}

		return products;
	}
	@Override
	public List<Product> getProductsBySeachCriteria(SearchCriteria criteria,
			Store store) {
		List<Product> products = new ArrayList<Product>();
		for (Mall mall : malls) {
			for (Store storeI : mall.getStores()) {
				if (storeI.equals(store)) {
					for (Product product : store.getProducts()) {
						if (product.matchCriteria(criteria)) {
							products.add(product);
						}
					}
					return products;
				}
			}
		}

		return products;
	}
	@Override
	public List<Product> getProductsBySeachCriteria(SearchCriteria criteria,
			Mall mall) {
		List<Product> products = new ArrayList<Product>();
		for (Store store : getStoresByMall(mall)) {
			for (Product product : store.getProducts()){
				if(product.matchCriteria(criteria)){
					products.add(product);
				}
			}
		}
		return products;
	}
	@Override
	public List<Product> getAllProducts() {
		List<Product> products = new ArrayList<Product>();
		for (Mall mall : malls) {
			for (Store store : mall.getStores()) {
				products = ListUtils.sum(products, store.getProducts());
			}
		}

		return products;
	}

	
}
