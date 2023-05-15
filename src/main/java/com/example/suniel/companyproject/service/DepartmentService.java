package com.example.suniel.companyproject.service;

import com.example.suniel.companyproject.dao.DepartmentRepository;
import com.example.suniel.companyproject.domain.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    public void addDepartments(Department department) {
         departmentRepository.save(department);
    }

    public void updateDepartments(long id, Department department) {
        department.setId(id);
        departmentRepository.save(department);
    }
}
