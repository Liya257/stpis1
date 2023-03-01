
package com.lab.stpis1.controller;

import com.lab.stpis1.entity.Transport;
import com.lab.stpis1.repository.TransportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transport")
public class TransportController {
    @Autowired
    private TransportRepository transportRepository;

    @GetMapping("/all")
    public List<Transport> findAllCompanies() {
        return transportRepository.findAll();
    }

    @GetMapping("/one/{id}")
    public Transport findOne(@PathVariable Long id) {
        return transportRepository.findById(id).get();
    }

    @PostMapping("/post")
    public String createCompany(@RequestBody Transport transport){
        transportRepository.save(transport);
        return "ok";
    }

    @PutMapping("/put")
    public Transport updateCompany(@RequestBody Transport transport) {
        return transportRepository.save(transport);
    }

    @DeleteMapping("/del/{id}")
    public String deleteCompany(@PathVariable Long id) {
        Transport transport = new Transport();
        transport.setId_transport(id);
        transportRepository.delete(transport);
        return "ok";
    }
}

