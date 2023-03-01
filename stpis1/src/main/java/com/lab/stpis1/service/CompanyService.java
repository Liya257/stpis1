/*
package com.lab.stpis1.service;

import com.lab.stpis1.entity.Company;
import com.lab.stpis1.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public class CompanyService {

    private CompanyRepository companyRepository;

    @Autowired
    CompanyService (CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }
    public List<Company> findAll() {
        return companyRepository.findAll();
    }



    public Company save(Company company) {
        return companyRepository.save(company);
    }

    public Company update(Company company) {
        return companyRepository.save(company);

    }

    public void delete(Company company) {
        companyRepository.delete(company);
    }

    public Optional<Company> findOne(Company company) {
       return companyRepository.findById(company.getId_company());
    }
}
*/
