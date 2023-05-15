package com.example.suniel.companyproject.service;

import com.example.suniel.companyproject.dao.AddressRepository;
import com.example.suniel.companyproject.domain.Address;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    private AddressRepository addressRepository;
    /*
    private AddressService(AddressRepository addressRepository){
        this.addressRepository = addressRepository;
    }

     */
    public List<Address> getAllAddresses() {
       return addressRepository.findAll();
    }

    public void addAddresses(Address address) {
        addressRepository.save(address);
    }

    public void updateAddress(long id, Address address) {
        address.setId(id);
        addressRepository.save(address);
    }

    @Transactional
    public void deleteAddressById(long id) {
        addressRepository.deleteAddressById(id);
    }

    public Optional<Address> getaddressById(long id) {
        return addressRepository.findById(id);
    }
}
