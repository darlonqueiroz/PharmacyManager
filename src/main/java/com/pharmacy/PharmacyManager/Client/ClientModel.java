package com.pharmacy.PharmacyManager.Client;

import com.pharmacy.PharmacyManager.Adress.AddressModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name ="tb_client")
@NoArgsConstructor
@AllArgsConstructor
public class ClientModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "cpf", unique = true)
    private String cpf;
    @Column(name = "name")
    private String name;
    @Column(name = "email", unique = true)
    private String email;
    @JoinColumn (name = "adress_id")
    @OneToOne (cascade = CascadeType.ALL)
    private AddressModel adress;
    @Column(name = "phone")
    private String phone;


}
