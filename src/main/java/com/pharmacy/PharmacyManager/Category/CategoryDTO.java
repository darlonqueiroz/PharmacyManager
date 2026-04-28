package com.pharmacy.PharmacyManager.Category;

import com.pharmacy.PharmacyManager.Product.ProductModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDTO {


    private Long id;

    private String name ;

    private boolean recipe;

    private ProductModel product;
}
