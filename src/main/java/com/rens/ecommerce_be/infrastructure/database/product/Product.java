package com.rens.ecommerce_be.infrastructure.database.product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "products")
public class Product {

    @Id
    private String productId;
    private String name;
    private String productImageUrl;
    private String description;
    private Integer quantity;
    private Double price;
    private String categoryId;

}
