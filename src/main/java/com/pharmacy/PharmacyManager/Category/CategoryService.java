package com.pharmacy.PharmacyManager.Category;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {

        this.categoryRepository = categoryRepository;
    }

    public List<CategoryModel> getAllCategories() {
        return categoryRepository.findAll();

    }


}
