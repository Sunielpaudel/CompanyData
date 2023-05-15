package com.example.suniel.companyproject.controller;

import com.example.suniel.companyproject.domain.Address;
import com.example.suniel.companyproject.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/addresses1")
public class AddressController {
    @Autowired
    private AddressService addressService;

    @GetMapping
    public List<Address> getAddress(){
        return addressService.getAllAddresses();
    }
    @GetMapping("/{id}")
    public Optional<Address> addressById(@RequestParam(value = "id") long id){
        return addressService.getaddressById( id);

    }
    @PostMapping
    public void addAddress(@RequestBody Address address){
        addressService.addAddresses(address);
    }
    @PutMapping("/{id}")
    public void updateAddress(@PathVariable ("id") long id, @RequestBody Address address){
        addressService.updateAddress(id,address);

    }

    @DeleteMapping("/{id}")
    public void deleteAddressById(@PathVariable long id){
        addressService.deleteAddressById(id);
    }

}
