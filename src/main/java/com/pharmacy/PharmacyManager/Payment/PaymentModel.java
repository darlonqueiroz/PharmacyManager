package com.pharmacy.PharmacyManager.Payment;

import com.pharmacy.PharmacyManager.Client.ClientModel;
import com.pharmacy.PharmacyManager.Product.ProductModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Data
@Table(name = "tb_payment")
@NoArgsConstructor
@AllArgsConstructor
public class PaymentModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long UUID;
    @OneToOne
    private ClientModel client;
    @OneToMany
    private List<ProductModel> product;
    @Column (name = "total_price")
    private BigDecimal totalPrice;


    public Long getUUID() {
        return UUID;
    }

    public void setUUID(Long UUID) {
        this.UUID = UUID;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public List<ProductModel> getProduct() {
        return product;
    }

    public void setProduct(List<ProductModel> product) {
        this.product = product;
    }

    public ClientModel getClient() {
        return client;
    }

    public void setClient(ClientModel client) {
        this.client = client;
    }



}
