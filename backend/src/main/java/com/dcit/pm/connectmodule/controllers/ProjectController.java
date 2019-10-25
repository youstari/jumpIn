/**
 * 
 */
package com.dcit.pm.connectmodule.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.mapping.Array;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dcit.pm.connectmodule.business.services.CustomerService;
import com.dcit.pm.connectmodule.entities.Customer;
import com.dcit.pm.connectmodule.entities.Project;

/**
 * @author Younes Elmestari
 *
 */
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/projects"})
public class ProjectController {

	@Autowired
	// ProjectService
    private CustomerService customerService;
   
	public List <Project> getProject(){
		return customerService.findAllProject();
	}	
	
	public int countProjects (){
		return customerService.findAllProject().size();
	}
	
	public List<Project> getActiveProjects(){
		return new ArrayList<>();
		// TODO: Ticket Jmpin: hier soll nur aktive Projekte filtbar nach Monat, Tage und Jahre
		
	}
}
