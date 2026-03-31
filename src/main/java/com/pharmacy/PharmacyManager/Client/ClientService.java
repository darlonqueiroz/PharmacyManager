package com.pharmacy.PharmacyManager.Client;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    private ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public List<ClientModel> getAllClients() {
        return clientRepository.findAll();
    }

     public ClientModel getClientById(Long id) {
        return clientRepository.findById(id).orElse(null);
    }

     public ClientModel saveClient(ClientModel client) {
        return clientRepository.save(client);
    }

     public void deleteClient(Long id) {
        clientRepository.deleteById(id);
    }
}
