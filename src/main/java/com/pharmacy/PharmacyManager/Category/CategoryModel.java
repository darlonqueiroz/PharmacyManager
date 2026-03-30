package com.pharmacy.PharmacyManager.Category;

import com.pharmacy.PharmacyManager.Product.ProductModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "tb_category")
@NoArgsConstructor
@AllArgsConstructor
public class CategoryModel {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   @Column(name = "name_category", unique = true)
   private String name ;
   @Column(name = "recipe")
   private boolean recipe;
   @OneToMany(mappedBy = "category")
   private ProductModel product;
}
