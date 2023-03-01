/*
package com.lab.stpis1.service;

import com.lab.stpis1.entity.Sales;
import com.lab.stpis1.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SalesService {
    private SaleRepository saleRepository;

    @Autowired
    SalesService (SaleRepository saleRepository) {
        this.saleRepository = saleRepository;
    }

    public List<Sales> findAll() {
        return saleRepository.findAll();

    }

    public Optional<Sales> findOne(Sales id) {
        return saleRepository.findById(id.getId_sales());
    }

    public void save(Sales sales) {
        saleRepository.save(sales);
    }

    public Sales update(Sales sales) {
        return saleRepository.save(sales);
    }

    public void delete(Sales id) {
        saleRepository.delete(id);
    }
}
*/
