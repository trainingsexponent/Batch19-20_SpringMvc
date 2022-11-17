package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.Employee;
import com.service.EmpService;

@Controller
public class HomeController {

	@Autowired
	private EmpService es;
	
	@RequestMapping(value = "/")
	public String getIndexPage() {
		System.out.println("Calling Index page");
		
	   return "index";
	}
	
	@RequestMapping(value = "/reg")
	public String getRegisterData(@ModelAttribute Employee employee) {
		System.out.println("EMployee Data : " + employee);
		es.addRegisterData(employee);
		return "login";
	}
}
