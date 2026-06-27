package com.pharmacy.PharmacyManager.Employer;


import jakarta.persistence.*;

@Entity
@Table(name = "tb_employer")
public class EmployerModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long UUID;
    @Column(name = "name", nullable = false)
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

    public EmployerModel(Long uuid, String name, String surname, String email, String password) {
        this.UUID = uuid;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
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
