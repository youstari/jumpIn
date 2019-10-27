import { Injectable } from '@angular/core';
import { HttpHeaders, HttpClient } from '@angular/common/http';

import { Customer } from '../models/customer.model';

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};


@Injectable()
export class CustomerService {

   constructor(private http:HttpClient) {}
  
  private customerUrl = 'http://localhost:8080/customers';
  
  
  getCustomers() {
    return    this.http.get<Customer[]>(this.customerUrl);
  }
}
