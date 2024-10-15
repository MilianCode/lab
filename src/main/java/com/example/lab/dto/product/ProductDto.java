package com.example.lab.dto.product;

import com.example.lab.model.Category;

public record ProductDto(String brand, String model,
                         int year, Category category) {
}
