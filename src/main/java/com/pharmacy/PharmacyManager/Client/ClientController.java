package com.pharmacy.PharmacyManager.Client;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("client")
public class ClientController {

    private ClientService clientService;

     public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/getclient")
    public List<ClientModel> GetAllClient(){
        return clientService.getAllClients();
    }

    @PostMapping("/postclient")
    public ClientModel PostClient(@RequestBody ClientModel client){
        return clientService.saveClient(client);
    }

    @PutMapping("/putclient")
    public ClientModel PutClient(@RequestBody ClientModel client){
        return clientService.saveClient(client);
    }
    @DeleteMapping("/deleteclient")
    public void DeleteClient(@RequestParam Long id){
        clientService.deleteClient(id);
    }

}
