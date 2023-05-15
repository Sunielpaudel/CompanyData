package com.example.suniel.companyproject.domain;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Department {
    @Id
    @SequenceGenerator( name = "address_sequence",
            sequenceName = "address_sequence",
            initialValue = 1,
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "address_sequence")
    private long id;

    @Column
    private String departmentName;

    @Column
    private String departmentCode;
}
