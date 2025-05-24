package com.rens.ecommerce_be.infrastructure.database.user.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "users")
public class UserData {
    @Id
    private Long userId;
    private String name;
    private String username;
    private String address;
    private String password;
    private List<String> orderIds;
    private Instant createdAt;

}
