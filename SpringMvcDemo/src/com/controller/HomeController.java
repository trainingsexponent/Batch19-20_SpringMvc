package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.Student;

@Controller
public class HomeController {

	@RequestMapping(value = "/pagecall")
    public String m1(@RequestParam String uname,@RequestParam("pass") String ps) {
		System.out.println("Data get Using Request Param : " + uname +  "  " + ps);
		System.out.println("Page Called");
		return "success";
	}

	@RequestMapping(value = "/reg/{uname}/{pass}")
    public String m2(@PathVariable("uname") String uname,@PathVariable("pass") String pass) {
		System.out.println("Data get Using Request Param : " + uname +  "  " + pass);
		System.out.println("Page Called");
		return "success";
	}
	
	@RequestMapping(value = "/register")
    public String m3(@ModelAttribute Student student,Model m) {
		System.out.println("Get Student Register Data : " + student);
		System.out.println("Page Called");
		m.addAttribute("s", student);
		return "success";
	}
}
