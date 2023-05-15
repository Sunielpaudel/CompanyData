package com.example.suniel.companyproject.domain;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Address {
    @Id
    @SequenceGenerator( name = "address_sequence",
            sequenceName = "address_sequence",
            initialValue = 1,
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "address_sequence")

    private long id;
    @Column
    private String city;
    @Column
    private String state;
    @Column
    private String zip;
    @Column
    private String street_name;
    @Column
    private String country;
}
