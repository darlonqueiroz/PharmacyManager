package com.pharmacy.PharmacyManager.cart;

import com.pharmacy.PharmacyManager.Product.ProductModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal freight;

    @OneToMany
    private List<ProductModel> product;
    @Column(name = "total_price")
    private BigDecimal totalPrice;
}
