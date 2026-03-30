package com.pharmacy.PharmacyManager.Client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ClientController {
    @GetMapping("/wellcome")
    public String wellCome(){
        return "<h1>Well Come</h1><img src='https://icons8.com.br/icon/5OD485koNIrb/java'/><br/><h3>Bem vindos ao mundo do Backend</h3>";


    }

}
