package com.service;

import java.util.List;

import com.model.Customer;

public interface CustomerService {
	
	void addCustomerData(Customer customer);
	
    List<Customer> getAllData(String uname,String pass);
    
    Customer getSingleCustomer(int id);
    
    List<Customer> getCheckUpdatedData(Customer customer);
    
    List<Customer> afterdeletingData(int id);
}
