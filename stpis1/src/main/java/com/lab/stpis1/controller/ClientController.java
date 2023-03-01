
package com.lab.stpis1.controller;

import com.lab.stpis1.entity.Client;
import com.lab.stpis1.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    private ClientRepository clientRepository;

    @GetMapping("/all")
    public List<Client> findAllCompanies() {
        return clientRepository.findAll();
    }

    @GetMapping("/one/{id}")
    public Client findOne(@PathVariable Long id) {
        return clientRepository.findById(id).get();
    }

    @PostMapping("/post")
    public String createCompany(@RequestBody Client client){
        clientRepository.save(client);
        return "ok";
    }

    @PutMapping("/put")
    public Client updateCompany(@RequestBody Client client) {
        return clientRepository.save(client);
    }

    @DeleteMapping("/del/{id}")
    public String deleteCompany(@PathVariable Long id) {
        Client client = new Client();
        client.setId_client(id);
        clientRepository.delete(client);
        return "ok";
    }
}

