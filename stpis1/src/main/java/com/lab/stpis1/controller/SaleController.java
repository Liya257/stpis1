
package com.lab.stpis1.controller;

import com.lab.stpis1.entity.Sales;
import com.lab.stpis1.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sale")
public class SaleController {
    @Autowired
    private SaleRepository saleRepository;

    @GetMapping("/all")
    public List<Sales> findAllCompanies() {
        return saleRepository.findAll();
    }

    @GetMapping("/one/{id}")
    public Sales findOne(@PathVariable Long id) {
        return saleRepository.findById(id).get();
    }

    @PostMapping("/post")
    public String createCompany(@RequestBody Sales sales){
        saleRepository.save(sales);
        return "ok";
    }

    @PutMapping("/putEmployee")
    public Sales updateCompany(@RequestBody Sales sales) {
        return saleRepository.save(sales);
    }

    @DeleteMapping("/del/{id}")
    public String deleteCompany(@PathVariable Long id) {
        Sales sales = new Sales();
        sales.setId_sales(id);
        saleRepository.delete(sales);
        return "ok";
    }
}

