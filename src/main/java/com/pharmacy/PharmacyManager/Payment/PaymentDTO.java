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

    @Column (name = "client")
    private ClientModel client;
    @Column (name = "product")
    private List<ProductModel> product;
    @Column (name = "total_price")
    private BigDecimal totalPrice;

    @OneToOne
    private List<OptionsPayment>optionsPayments;

}
