package com.example.suniel.companyproject.dao;

import com.example.suniel.companyproject.domain.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
    List<Department> findAll();

}
