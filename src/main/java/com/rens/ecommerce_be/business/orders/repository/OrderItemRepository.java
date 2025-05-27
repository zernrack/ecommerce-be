package com.rens.ecommerce_be.business.orders.repository;

import com.rens.ecommerce_be.business.orders.entities.OrderItem;
import reactor.core.publisher.Mono;

public interface OrderItemRepository {
    Mono<OrderItem> createOrderItem(OrderItem orderItem);

    Mono<OrderItem> getOrderItemById(String id);

    Mono<OrderItem> deleteOrderItemById(String id);

    Mono<OrderItem> updateOrderItem(OrderItem orderItem);

    Mono<OrderItem> getOrderItemByUserId(String userId);
}
