package com.example.lab.service;

import com.example.lab.dto.product.CreateProductRequestDto;
import com.example.lab.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllByCategory(String category);

    Product createProduct(CreateProductRequestDto request);
}
