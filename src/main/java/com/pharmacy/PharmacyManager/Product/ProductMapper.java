package com.pharmacy.PharmacyManager.Product;

public class ProductMapper {
    public static ProductDTO toDTO(ProductModel productModel) {
        if (productModel == null) {
            return null;
        }
        return new ProductDTO(
                productModel.getId(),
                productModel.getCodeProduct(),
                productModel.getName(),
                productModel.getPrice(),
                productModel.getQuantity(),
                productModel.getValidity(),
                productModel.getDescription(),
                productModel.getCategory()
        );
    }

    public static ProductModel toEntity(ProductDTO productDTO) {
        if (productDTO == null) {
            return null;
        }
        return new ProductModel(
                productDTO.getId(),
                productDTO.getCodeProduct(),
                productDTO.getName(),
                productDTO.getPrice(),
                productDTO.getQuantity(),
                productDTO.getValidity(),
                productDTO.getDescription(),
                productDTO.getCategory()
        );
    }
}
