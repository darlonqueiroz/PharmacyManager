package com.pharmacy.PharmacyManager.Product;

import com.pharmacy.PharmacyManager.Category.CategoryModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {


    private Long id;

    private String codeProduct;

    private String name;

    private BigDecimal price;

    private Integer quantity;

    private String validity;

    private String description;

    private List<CategoryModel> category;

}
