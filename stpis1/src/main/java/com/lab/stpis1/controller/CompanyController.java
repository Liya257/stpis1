package com.lab.stpis1.controller;

import com.lab.stpis1.entity.Company;
import com.lab.stpis1.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {

    public CompanyRepository companyRepository;

    @Autowired
    CompanyController (CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @GetMapping("/all")
    public List<Company> findAllCompanies() {
        return companyRepository.findAll();
    }

    @GetMapping("/one/{id}")
    public Company findOne(@PathVariable Long id) {
        return companyRepository.findById(id).get();
    }

    @PostMapping("/post")
    public String createCompany(@RequestBody Company company){
        companyRepository.save(company);
        return "ok";
    }

    @PutMapping("/putCompany")
    public Company updateCompany(@RequestBody Company company) {
        return companyRepository.save(company);
    }

    @DeleteMapping("/del/{id}")
    public String deleteCompany(@PathVariable Long id) {
        Company company = new Company();
        company.setId_company(id);
        companyRepository.delete(company);
        return "ok";
    }
}
