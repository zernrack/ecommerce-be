package com.rens.ecommerce_be.infrastructure.database.user.repository;

import com.rens.ecommerce_be.infrastructure.database.user.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface UserRepository extends ReactiveMongoRepository<User, String> {

    @Query("{ 'username': ?0 }")
    Mono<User> findByUsername(String username);

    @Query("{ 'email': ?0 }")
    Mono<User> findByEmail(String email);

    @Query("{ 'phoneNumber': ?0 }")
    Mono<User> findByPhoneNumber(String phoneNumber);
}
