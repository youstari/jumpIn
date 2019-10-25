/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dcit.pm.connectmodule.business.services;
import com.dcit.pm.connectmodule.entities.Customer;
import com.dcit.pm.connectmodule.entities.Project;

import java.util.List;
/**
 *
 * @author Younes Elmestari
 */
public interface CustomerService {
    List <Customer> findAll();
    
    List <Project>  findAllProject();
    
    Customer findByCustId(Long CustId);
    
    List<Project> findByCustomer(Customer customer, Project project);
    
    
}
