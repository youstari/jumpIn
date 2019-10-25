/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dcit.pm.connectmodule.business.services;

import com.dcit.pm.connectmodule.entities.Customer;
import com.dcit.pm.connectmodule.entities.Project;
import com.dcit.pm.connectmodule.jpa.CustomerRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Younes Elmestari
 */
@Service
public class CustomerServiceImp implements CustomerService{
    @Autowired
    private CustomerRepository cRepository;
    @Override
    public List<Customer> findAll() {
        return cRepository.findAll();
    }
	@Override
	public List<Project> findAllProject() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Customer findByCustId(Long CustId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Project> findByCustomer(Customer customer, Project project) {
		// TODO Auto-generated method stub
		return null;
	}
    
}
