package com.pharmacy.PharmacyManager.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository <EmployeeModel, Long> {
     EmployeeModel findByEmail(String email);
}
