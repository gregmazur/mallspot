package org.hillel.it.mallspot.persistance.repository;

import org.hillel.it.mallspot.model.entity.Cart;

public interface OrderRepository {
boolean createOrder(Cart cart);
boolean changeOrder(Cart cart, Cart newCart);
}
