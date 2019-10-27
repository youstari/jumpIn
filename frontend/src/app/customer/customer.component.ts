import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { Customer } from '../models/customer.model';
import { CustomerService } from '../services/customer.service';

@Component({
  
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.css']
})
export class CustomerComponent implements OnInit {

  customers: Customer[];
  
  constructor(private router:Router, private customerService: CustomerService) { 
     
    }
  ngOnInit() {
   this.customerService
           .getCustomers()
           .subscribe( data => {
               this.customers = data;
               console.log(this.customers);
                });
            
    }

}
