package com.pharmacy.PharmacyManager.Client;

public class ClientMapper {
    public ClientModel mapClient (ClientDTO clientDTO) {

        ClientModel clientModel = new ClientModel();
        clientModel.setId(clientDTO.getId());
        clientModel.setName(clientDTO.getName());
        clientModel.setEmail(clientDTO.getEmail());
        clientModel.setPhone(clientDTO.getPhone());
        return clientModel;
    }

    public ClientDTO mapClientDTO (ClientModel clientModel) {

        ClientDTO clientDTO = new ClientDTO();
        clientDTO.setId(clientModel.getId());
        clientDTO.setName(clientModel.getName());
        clientDTO.setEmail(clientModel.getEmail());
        clientDTO.setPhone(clientModel.getPhone());
        return clientDTO;
    }
}
