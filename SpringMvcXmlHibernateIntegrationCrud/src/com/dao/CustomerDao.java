package com.dao;

import java.util.List;

import com.model.Customer;

public interface CustomerDao {

	void addCustomerData(Customer customer);
	
	List<Customer> getAllData(String un,String ps);
}
