package com.example.suniel.companyproject.controller;

import com.example.suniel.companyproject.domain.Department;
import com.example.suniel.companyproject.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @GetMapping
    public List<Department> getAllDepartments(){
        return departmentService.getAllDepartments();
    }

    @PostMapping
    public void addDepartments(@RequestBody Department department){
         departmentService.addDepartments(department);
    }

    @PutMapping("/{id}")
    public void updateDepartments(@PathVariable ("id") long id, @RequestBody Department department){
        departmentService.updateDepartments(id, department);
    }
}
