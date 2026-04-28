package com.pharmacy.PharmacyManager.Client;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClientDTO {


    private Long id;

    private String cpf;

    private String name;

    private String email;

    private String adress;

    private String phone;

}
