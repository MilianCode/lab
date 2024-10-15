package com.example.lab.service.impl;

import com.example.lab.dto.product.CreateProductRequestDto;
import com.example.lab.mapper.ProductMapper;
import com.example.lab.model.Category;
import com.example.lab.model.Product;
import com.example.lab.repository.CategoryRepository;
import com.example.lab.repository.ProductRepository;
import com.example.lab.service.ProductService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;
    private final ProductMapper productMapper;

    @Override
    public List<Product> getAllByCategory(String category) {
        return productRepository.getALlByCategoryId(getCategory(category).getId());
    }

    @Override
    public Product createProduct(CreateProductRequestDto request) {
        Product product = productMapper.toModelWithoutCategory(request);
        product.setCategory(getCategory(request.getCategory()));
        return productRepository.save(product);
    }

    private Category getCategory(String category){
        return categoryRepository.getCategoryByName(category)
                .orElseThrow(
                        () -> new EntityNotFoundException(
                                "Cannot find category with name = "
                                    + category
                        )
                );
    }
}
