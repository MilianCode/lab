package com.example.lab.controller;

import com.example.lab.dto.product.CreateProductRequestDto;
import com.example.lab.model.Product;
import com.example.lab.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping("/{category}")
    public List<Product> getByCategory(@PathVariable String category) {
        return productService.getAllByCategory(category);
    }

    @PostMapping
    public Product createProduct(@RequestBody CreateProductRequestDto requestDto) {
        return productService.createProduct(requestDto);
    }
}
