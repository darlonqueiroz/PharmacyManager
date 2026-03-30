package com.pharmacy.PharmacyManager.Product;

import com.pharmacy.PharmacyManager.Category.CategoryModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@Table(name = "tb_product")
@NoArgsConstructor
@AllArgsConstructor
public class ProductModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name ="code_product")
    private String codeProduct;
    @Column(name = "name_product")
    private String name;
    @Column (name = "price_product")
    private int price;
    @Column(name ="validity")
    private String validity;
    @Column(name ="description")
    private String description;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private List<CategoryModel>category;


}
