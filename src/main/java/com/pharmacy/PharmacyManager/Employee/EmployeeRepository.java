package com.pharmacy.PharmacyManager.Employer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployerRepository extends JpaRepository <EmployerModel, Long> {
     EmployerModel findByEmail(String email);
}
