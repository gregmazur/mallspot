package org.hillel.it.mallspot.persistance.repository;

import org.hillel.it.mallspot.model.entity.Order;



public interface OrderRepository {
boolean addOrder(Order order);
boolean changeOrder(Order order, Order newOrder);
}
