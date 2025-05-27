package com.rens.ecommerce_be.infrastructure.database.user.repository;

import com.rens.ecommerce_be.infrastructure.database.user.entities.UserData;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface UserRepository extends ReactiveMongoRepository<UserData, String> {

    @Query("{ 'username': ?0 }")
    Mono<UserData> findByUsername(String username);

    @Query("{ 'email': ?0 }")
    Mono<UserData> findByEmail(String email);

    @Query("{ 'phoneNumber': ?0 }")
    Mono<UserData> findByPhoneNumber(String phoneNumber);
}
