package com.pharmacy.PharmacyManager.Login;

import org.springframework.data.jpa.repository.JpaRepository;

public class LoginRepository implements JpaRepository <LoginModel, Long> {
    LoginModel findByEmail(String email);
}
