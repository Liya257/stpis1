/*
package com.lab.stpis1.service;

import com.lab.stpis1.entity.Client;
import com.lab.stpis1.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
    private ClientRepository clientRepository;

    @Autowired
    ClientService (ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public List<Client> findAll() {
        return clientRepository.findAll();
    }

    public Optional<Client> findOne(Client id) {
        return clientRepository.findById(id.getId_client());
    }

    public void save(Client client) {
        clientRepository.save(client);
    }

    public Client update(Client client) {
        return clientRepository.save(client);
    }

    public void delete(Client id) {
        clientRepository.delete(id);
    }
}
*/
