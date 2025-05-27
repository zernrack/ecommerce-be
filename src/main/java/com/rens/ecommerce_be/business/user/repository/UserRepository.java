package com.rens.ecommerce_be.business.user.repository;

import com.rens.ecommerce_be.business.user.entities.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserRepository {

     Mono<User> createUser(User user);

     Mono<User> getUserById(String id);
     Mono<User> getUserByEmail(String email);

     Mono<User> updateUser(User user);

     Mono<Void> deleteUserById(String id);

     Flux<User> getAllUsers();
}
