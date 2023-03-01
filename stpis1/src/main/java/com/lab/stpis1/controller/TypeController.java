
package com.lab.stpis1.controller;

import com.lab.stpis1.entity.Type;
import com.lab.stpis1.repository.CompanyRepository;
import com.lab.stpis1.repository.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/type")
public class TypeController {
    public TypeRepository typeRepository;

    @Autowired
    TypeController (TypeRepository typeRepository) {
        this.typeRepository = typeRepository;
    }

    @GetMapping("/all")
    public List<Type> findAllCompanies() {
        return typeRepository.findAll();
    }

    @GetMapping("/{id}")
    public Type findOne(@PathVariable Long id) {
        return typeRepository.findById(id).get();
    }

    @PostMapping("/post")
    public Type createCompany(@RequestBody Type type){
        return typeRepository.save(type);
    }

    @PutMapping("/put")
    public Type updateCompany(@RequestBody Type type) {
        return typeRepository.save(type);
    }

    @DeleteMapping("/del/{id}")
    public String deleteCompany(@PathVariable Long id) {
        Type type = new Type();
        type.setId_type(id);
        typeRepository.delete(type);
        return "ok";
    }
}

