package org.hillel.it.mallspot.persistance.inmemory.test;

import static org.junit.Assert.*;

import org.hillel.it.mallspot.model.entity.Product;
import org.hillel.it.mallspot.persistance.inmemory.MemoryProductRepository;
import org.hillel.it.mallspot.persistance.repository.ProductsRepository;
import org.junit.Before;
import org.junit.Test;

public class RepositoriesTest {
	ProductsRepository rep = new MemoryProductRepository();
	@Before
	public void before(){
		Product product = new Product("First", 73, "description", null);
		Product product1 = new Product("Sec", 73, "war sex", null);
		Product product2 = new Product("Th", 73, "scar, scri", null);
		Product product3 = new Product("F", 73, "face war", null);
		rep.addProduct(product);
		rep.addProduct(product1);
		rep.addProduct(product2);
		rep.addProduct(product3);
	}

	@Test
	public void test() {
		
		
	}

}
