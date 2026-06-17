package com.pharmacy.PharmacyManager.Employer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployerRepository extends JpaRepository <Employer, Long> {
     Employer findByEmail(String email);
}
