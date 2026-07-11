package com.pharmacy.PharmacyManager.Login;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository <LoginModel, Long> {

    LoginModel findByEmail(String email);

}
