package com.rens.ecommerce_be.infrastructure.database.orders.repository;

import com.rens.ecommerce_be.infrastructure.database.orders.entities.Order;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface OrderRepository extends ReactiveMongoRepository<Order, String> {
}
