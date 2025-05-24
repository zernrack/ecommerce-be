package com.rens.ecommerce_be.infrastructure.database.user.service;

import com.rens.ecommerce_be.infrastructure.database.user.entities.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserService {
    Mono<User> registerUser(String name,String username, String password);

    Mono<User> loginUser(String username, String password);

    Flux<User> getAllUsers();
}
