package com.pharmacy.PharmacyManager.Payment;

import com.pharmacy.PharmacyManager.Client.ClientModel;
import com.pharmacy.PharmacyManager.Product.ProductModel;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
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

}
