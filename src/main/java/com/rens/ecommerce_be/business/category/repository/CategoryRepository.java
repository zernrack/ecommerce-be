package com.rens.ecommerce_be.business.category.repository;

import com.rens.ecommerce_be.business.category.entities.Category;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CategoryRepository {
    Mono<Category> findById(String id);

    Flux<Category> getAllCategory();

    Mono<Category> deleteById(String id);

    Mono<Category> updateCategory(Category category);

    Mono<Category> createCategory(Category category);
}
