package com.example.suniel.companyproject.dao;

import com.example.suniel.companyproject.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
    Employee findByLastName(String lastName);
}
