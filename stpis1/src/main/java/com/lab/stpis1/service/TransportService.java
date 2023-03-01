/*
package com.lab.stpis1.service;

import com.lab.stpis1.entity.Transport;
import com.lab.stpis1.repository.TransportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransportService {
    private TransportRepository transportRepository;

    @Autowired
    TransportService (TransportRepository transportRepository) {
        this.transportRepository = transportRepository;
    }

    public List<Transport> findAll() {
        return transportRepository.findAll();
    }

    public Optional<Transport> findOne(Transport id) {
        return transportRepository.findById(id.getId_transport());
    }

    public void save(Transport transport) {
        transportRepository.save(transport);
    }

    public Transport update(Transport transport) {
        return transportRepository.save(transport);
    }

    public void delete(Transport id) {
        transportRepository.delete(id);
    }
}
*/
