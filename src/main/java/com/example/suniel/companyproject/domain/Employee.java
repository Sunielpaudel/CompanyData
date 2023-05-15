package com.example.suniel.companyproject.domain;

import jakarta.persistence.*;
import lombok.*;
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee {
    @Id
    @SequenceGenerator( name = "employee_sequence",
            sequenceName = "employee_sequence",
            initialValue = 1,
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employee_sequence")
    private long id;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private long dob;
    @Column
    private long hireDate;
    @Column
    private long addressId;
    @Column
    private long departmentId;
}
