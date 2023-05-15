package com.example.suniel.companyproject.controller;

import com.example.suniel.companyproject.domain.Employee;
import com.example.suniel.companyproject.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
      @Autowired
     private EmployeeService employeeService;
      /*

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

       */

    @GetMapping
    public List<Employee> getEmployee(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{lastName}")
    public Employee getEmployeeByLastName(@PathVariable("lastName") String lastName){
        return employeeService.getEmployeeByLastName(lastName);
    }
    @PostMapping
    public void addEmployee(@RequestBody Employee employee){
        employeeService.addEmployee(employee);

    }
    @PutMapping("/{id}")
    public void updateEmployee(@PathVariable("id") long id, @RequestBody Employee employee) {
        employeeService.updateEmployee(id, employee);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployeeId(@PathVariable("id") long id){
        employeeService.deleteEmployeeId(id);
    }

}
