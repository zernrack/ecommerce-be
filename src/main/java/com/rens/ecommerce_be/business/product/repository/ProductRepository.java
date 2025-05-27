package com.rens.ecommerce_be.business.product.repository;

import com.rens.ecommerce_be.business.product.entities.Product;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductRepository {
    Mono<Product> createProduct(Product product);

    Mono<Product> getProductByName(String name);

    Mono<Product> deleteProductByName(String name);

    Flux<Product> getAllProducts();

    Mono<Product> updateProduct(Product product);
}
