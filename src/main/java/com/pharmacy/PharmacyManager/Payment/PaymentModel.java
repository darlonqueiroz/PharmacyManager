package com.pharmacy.PharmacyManager.Payment;

import com.pharmacy.PharmacyManager.Client.ClientModel;
import com.pharmacy.PharmacyManager.Product.ProductModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@Table(name = "tb_payment")
@NoArgsConstructor
@AllArgsConstructor
public class PaymentModel {
    @OneToOne
    private ClientModel client;
    @OneToMany
    private List<ProductModel> product;
    @Column (name = "total_price")
    private int totalPrice;


}
