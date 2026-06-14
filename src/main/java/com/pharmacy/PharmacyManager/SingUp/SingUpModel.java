package com.pharmacy.PharmacyManager.SingUp;

import jakarta.persistence.*;

@Entity
@Table (name = "singup")
public class SingUpModel {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "email", unique = true)
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "cnpj")
    private Long cnpj;

    public SingUpModel() {
    }

    public SingUpModel(String name, String email, String password, Long cnpj) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.cnpj = cnpj;
    }



}
