package com.rens.ecommerce_be.infrastructure.database.orders.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "orders")
public class Order {

    @Id
    private String orderId;
    private Instant orderDate;
    private Double total;
    private String userId;
    private List<OrderItem> items;
}
