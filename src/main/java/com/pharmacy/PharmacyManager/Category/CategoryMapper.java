package com.pharmacy.PharmacyManager.Category;

public class CategoryMapper {
    public CategoryModel mapCategory (CategoryDTO categoryDTO) {

        CategoryModel categoryModel = new CategoryModel();
        categoryModel.setId(categoryDTO.getId());
        categoryModel.setName(categoryDTO.getName());
        categoryModel.setRecipe(categoryDTO.isRecipe());
        categoryModel.setProduct(categoryDTO.getProduct());
        return categoryModel;
    }

    public CategoryDTO mapCategoryDTO (CategoryModel categoryModel) {

        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setId(categoryModel.getId());
        categoryDTO.setName(categoryModel.getName());
        categoryDTO.setRecipe(categoryModel.isRecipe());
        categoryDTO.setProduct(categoryModel.getProduct());
        return categoryDTO;
    }
}
