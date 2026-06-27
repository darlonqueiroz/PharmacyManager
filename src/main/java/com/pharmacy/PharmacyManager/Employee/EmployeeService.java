package com.pharmacy.PharmacyManager.Employee;

public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public void saveUser(EmployeeModel employer){
        employeeRepository.saveAndFlush(employer);
    }
}
