package com.example.suniel.companyproject.controller;

import com.example.suniel.companyproject.domain.Address;
import com.example.suniel.companyproject.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/addresses211")
public class AddressController {
    @Autowired
    private AddressService addressService;

    @GetMapping
    public ResponseEntity<List<Address>> getAddress(){
        System.out.println("Retrieving all addresses");
        System.out.println("Changes from other teammate");
        List<Address> list = addressService.getAllAddresses();
        if (list.size()<=0) {

            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(list));
    }
    @GetMapping("/{id}")
    public Optional<Address> addressById(@RequestParam(value = "id") long id){
        System.out.println("Conflict Testing..");
        return addressService.getaddressById( id);

    }
    @PostMapping
    public void addAddress(@RequestBody Address address){
        addressService.addAddresses(address);
    }
    @PutMapping("/{id}")
    public void updateAddress(@PathVariable ("id") long id, @RequestBody Address address){
         System.out.println("Updating address..");
        addressService.updateAddress(id,address);

    }
    
    @GetMapping("/address1/{id}")
    public void getAddress1(@PathVariable long id){
        addressService.deleteAddressById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteAddressById(@PathVariable long id){
        addressService.deleteAddressById(id);
    }

    @GetMapping("/address2/{id}")
    public void getAddress2(@PathVariable long id){
        addressService.deleteAddressById(id);
    }
}
