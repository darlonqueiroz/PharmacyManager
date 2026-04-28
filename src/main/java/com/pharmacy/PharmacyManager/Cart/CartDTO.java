package com.pharmacy.PharmacyManager.Cart;


import com.pharmacy.PharmacyManager.Product.ProductModel;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartDTO {

    private Long id;
    private BigDecimal freight;


    private List<ProductModel> product;

    private BigDecimal totalPrice;
}
