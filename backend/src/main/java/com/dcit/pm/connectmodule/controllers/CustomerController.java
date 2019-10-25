package com.dcit.pm.connectmodule.controllers;

import com.dcit.pm.connectmodule.business.services.CustomerService;
import com.dcit.pm.connectmodule.entities.Customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/customers"})
public class CustomerController {

    @Autowired
    private CustomerService customerService;
   
    @GetMapping()
    public List <Customer> findAll() {
       
        return customerService.findAll();
    }

}
