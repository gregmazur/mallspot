package org.hillel.it.mallspot.persistance.repository;

import org.hillel.it.mallspot.model.entity.Order;



public interface OrderRepository {
Order addOrder(Order order);
Order changeOrder(Order order, Order newOrder);
}
