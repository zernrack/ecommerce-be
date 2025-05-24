package com.rens.ecommerce_be.infrastructure.database.user.service;

import com.rens.ecommerce_be.infrastructure.database.user.entities.UserData;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserService {
    Mono<UserData> registerUser(String name, String username, String password);

    Mono<UserData> loginUser(String username, String password);

    Flux<UserData> getAllUsers();
}
