/*
package com.lab.stpis1.service;

import com.lab.stpis1.entity.Company;
import com.lab.stpis1.entity.Employee;
import com.lab.stpis1.repository.CompanyRepository;
import com.lab.stpis1.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    private EmployeeRepository employeeRepository;

    @Autowired
    EmployeeService (EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    public Optional<Employee> findOne(Employee id) {
        return employeeRepository.findById(id.getId_employee());
    }

    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee update(Employee employee) {
        return employeeRepository.save(employee);
    }

    public void delete(Employee id) {
        employeeRepository.delete(id);
    }
}
*/
