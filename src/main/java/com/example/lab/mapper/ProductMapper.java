package com.example.lab.mapper;

import com.example.lab.dto.product.CreateProductRequestDto;
import com.example.lab.dto.product.ProductDto;
import com.example.lab.model.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {
    public ProductDto toDto(Product product) {
        return new ProductDto(product.getBrand(), product.getModel(),
                product.getYear(), product.getCategory());
    }

    public Product toModelWithoutCategory(CreateProductRequestDto requestDto) {
        Product product = new Product();
        product.setBrand(requestDto.getBrand());
        product.setModel(requestDto.getModel());
        product.setYear(requestDto.getYear());
        return product;
    }
}
