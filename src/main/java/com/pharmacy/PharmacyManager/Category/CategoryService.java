package com.pharmacy.PharmacyManager.Category;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    private CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {

        this.categoryRepository = categoryRepository;
    }

    public List<CategoryRepository> getAllCategories() {
        return categoryRepository.findAll();

    }


}
