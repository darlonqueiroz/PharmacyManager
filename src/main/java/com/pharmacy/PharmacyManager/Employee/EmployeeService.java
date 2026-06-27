package com.pharmacy.PharmacyManager.Employer;

public class EmployerService {
    private final EmployerRepository  employerRepository;

    public EmployerService (EmployerRepository employerRepository) {
        this.employerRepository = employerRepository;
    }

    public void saveUser(EmployerModel employer){
        employerRepository.saveAndFlush(employer);
    }
}
