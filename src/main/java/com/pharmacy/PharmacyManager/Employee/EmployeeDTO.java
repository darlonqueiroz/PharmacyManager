package com.pharmacy.PharmacyManager.Employee;

import jakarta.persistence.Column;

public class EmployeeDTO {


    private Long UUID;
    private String name;
    private String surname;
    private String email;
    private String password;


    public Long getUUID() {
        return UUID;
    }

    public void setUUID(Long UUID) {
        this.UUID = UUID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
