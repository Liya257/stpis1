
package com.lab.stpis1.controller;

import com.lab.stpis1.entity.Employee;
import com.lab.stpis1.repository.CompanyRepository;
import com.lab.stpis1.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empl")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/all")
    public List<Employee> findAllCompanies() {
        return employeeRepository.findAll();
    }

    @GetMapping("/one/{id}")
    public Employee findOne(@PathVariable Long id) {
        return employeeRepository.findById(id).get();
    }

    @PostMapping("/post")
    public String createCompany(@RequestBody Employee employee){
        employeeRepository.save(employee);
        return "ok";
    }

    @PutMapping("/putEmployee")
    public Employee updateCompany(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

    @DeleteMapping("/del/{id}")
    public String deleteCompany(@PathVariable Long id) {
        Employee employee = new Employee();
        employee.setId_employee(id);
        employeeRepository.delete(employee);
        return "ok";
    }
}

