package com.rens.ecommerce_be.infrastructure.database.product.repository;

import com.rens.ecommerce_be.infrastructure.database.product.Product;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProductRepository extends ReactiveMongoRepository<Product, String> {
}
