package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.Customer;
import com.service.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(value = "/reg")
	public String addCustomerData(@ModelAttribute Customer customer) {
		System.out.println("Registered Data : " + customer);
		customerService.addCustomerData(customer);
		return "login";
	}
	
	@RequestMapping(value = "/log")
	public String getLoginData(@RequestParam String uname,@RequestParam String pass,Model m) {
		System.out.println("Login Credentials : " + uname +  "  " + pass);
		List<Customer> clist = customerService.getAllData(uname, pass);
		if(!clist.isEmpty()) {
			m.addAttribute("cl", clist);
			return "success";
		}
		return "login";
	}
	
	@RequestMapping(value = "/edit")
	public String editCustomerData(@RequestParam int id,Model m) {
		Customer customer = customerService.getSingleCustomer(id);
		m.addAttribute("c",customer);
		return "edit";
	}
	
	@RequestMapping(value = "/up")
	public String updteCutomerData(@ModelAttribute Customer customer,Model m) {
		List<Customer> clist = customerService.getCheckUpdatedData(customer);
		m.addAttribute("cl", clist);
		return "success";
	}
	
	@RequestMapping(value = "/del")
	public String deleteCustomerData(@RequestParam int id,Model m) {
		List<Customer> clist = customerService.afterdeletingData(id);
		m.addAttribute("cl", clist);
		return "success";
	}
}
