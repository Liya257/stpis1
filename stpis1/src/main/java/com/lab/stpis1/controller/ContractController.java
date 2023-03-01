package com.lab.stpis1.controller;

import com.lab.stpis1.entity.Contract;
import com.lab.stpis1.repository.ContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contract")
public class ContractController {
    @Autowired
    private ContractRepository contractRepository;

    @GetMapping("/all")
    public List<Contract> findAllCompanies() {
        return contractRepository.findAll();
    }

    @GetMapping("/one/{id}")
    public Contract findOne(@RequestParam Contract id) {
        return contractRepository.findById(id.getId_contract()).get();
    }

    @PostMapping("/post")
    public String createCompany(@RequestBody Contract transport){
        contractRepository.save(transport);
        return "ok";
    }

    @PutMapping("/putEmployee")
    public Contract updateCompany(@RequestBody Contract contract) {
        return contractRepository.save(contract);
    }

    @DeleteMapping("/del/{id}")
    public String deleteCompany(@RequestParam Contract id) {
        contractRepository.delete(id);
        return "ok";
    }
}
