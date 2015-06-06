package mallspot.persistance.repository;

import mallspot.model.entity.Order;



public interface OrderRepository {
Order addOrder(Order order);
Order changeOrder(Order order, Order newOrder);
}
