package com.rens.ecommerce_be.infrastructure.database.repository;

import com.rens.ecommerce_be.infrastructure.database.user.User;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface UserRepository extends ReactiveMongoRepository<User, String> {
}
