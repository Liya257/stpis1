
package com.lab.stpis1.controller;

import com.lab.stpis1.entity.Application;
import com.lab.stpis1.entity.Company;
import com.lab.stpis1.repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/application")
public class ApplicationController {
    @Autowired
    private ApplicationRepository applicationRepository;

    @GetMapping("/all")
    public List<Application> findAllCompanies() {
        return applicationRepository.findAll();
    }

    @GetMapping("/{id}")
    public Application findOne(@PathVariable Long id) {
        return applicationRepository.findById(id).get();
    }

    @PostMapping("/post")
    public String createCompany(@RequestBody Application application){
        applicationRepository.save(application);
        return "ok";
    }

    @PutMapping("/put")
    public Application updateCompany(@RequestBody Application application) {
        return applicationRepository.save(application);
    }

    @DeleteMapping("/del/{id}")
    public String deleteCompany(@PathVariable Long id) {
        Application application = new Application();
        application.setId_app(id);
        applicationRepository.delete(application);
        return "ok";
    }
}

