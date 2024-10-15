package com.example.lab.dto.product;

import lombok.Data;

@Data
public class CreateProductRequestDto {
    private String brand;
    private String model;
    private int year;
    private String category;
}
