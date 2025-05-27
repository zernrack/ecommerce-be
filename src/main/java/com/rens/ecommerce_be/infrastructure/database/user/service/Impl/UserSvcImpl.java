package com.rens.ecommerce_be.infrastructure.database.user.service.Impl;

import com.rens.ecommerce_be.infrastructure.database.user.entities.UserData;
import com.rens.ecommerce_be.infrastructure.database.user.repository.UserRepository;
import com.rens.ecommerce_be.infrastructure.database.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class UserSvcImpl implements UserService {

    private final UserRepository userRepository;


    @Override
    public Mono<UserData> registerUser(String name, String userName, String password) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        String hashedPassword = bCryptPasswordEncoder.encode(password);
        return userRepository.save(UserData.builder()
                .name(name)
                .username(userName)
                .password(hashedPassword)
                .build());
    }

    @Override
    public Mono<UserData> loginUser(String username, String password) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        return userRepository.findByUsername(username)
                .flatMap(user -> {
                    if (bCryptPasswordEncoder.matches(password, user.getPassword())) {
                        return Mono.just(user);
                    } else {
                        return Mono.error(new RuntimeException("Invalid username or password"));
                    }
                })
                .switchIfEmpty(Mono.error(new RuntimeException("Invalid username or password")));
    }

    @Override
    public Flux<UserData> getAllUsers() {
        return userRepository.findAll();
    }
}
