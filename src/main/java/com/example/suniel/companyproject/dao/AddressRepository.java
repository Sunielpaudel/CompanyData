package com.example.suniel.companyproject.dao;

import com.example.suniel.companyproject.domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

    void deleteAddressById(long id);
}
