package com.rens.ecommerce_be.business.orders.repository;

import com.rens.ecommerce_be.business.orders.entities.Order;
import reactor.core.publisher.Mono;

public interface OrderRepository {
    Mono<Order> createOrder(Order order);

    Mono<Order> getOrderById(String id);

    Mono<Order> deleteOrderById(String id);

    Mono<Order> updateOrder(Order order);

    Mono<Order> getOrderByUserId(String userId);

    Mono<Order> getOrderByOrderId(String orderId);

}
