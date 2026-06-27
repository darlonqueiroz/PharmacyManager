package com.pharmacy.PharmacyManager.Login;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Entity
@Table (name = "tb_login")
public class LoginModel {


    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long UUID;
    private String email;
    private String password;

    public LoginModel(String name, String surname, String email, String password, Long UUID) {
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return UUID;
    }

    public void setId(Long id) {
        this.UUID= id;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
