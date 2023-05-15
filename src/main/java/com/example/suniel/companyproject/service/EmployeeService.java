package com.example.suniel.companyproject.service;

import com.example.suniel.companyproject.dao.EmployeeRepository;
import com.example.suniel.companyproject.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    /*

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

     */

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public void addEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    public void updateEmployee(long id, Employee employee) {
        employee.setId(id);
        employeeRepository.save(employee);
    }

    public void deleteEmployeeId(long id) {
        employeeRepository.deleteAllById(Collections.singleton(id));
    }


    public Employee getEmployeeByLastName(String lastName) {
        return employeeRepository.findByLastName(lastName);
    }
}
