package com.example.lab.mapper;

import com.example.lab.dto.CategoryDto;
import com.example.lab.model.Category;
import org.springframework.stereotype.Component;

@Component
public class CategoryMapper {
    public CategoryDto toDto(Category category) {
        return new CategoryDto(category.getName(),
                category.getDescription());
    }
}
