package com.pharmacy.PharmacyManager.Payment;

import com.pharmacy.PharmacyManager.Client.ClientModel;
import com.pharmacy.PharmacyManager.Product.ProductModel;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentDTO {


    private ClientModel client;

    private List<ProductModel> product;

    private BigDecimal totalPrice;

    private List<optionsPayment>optionsPayments;

}
