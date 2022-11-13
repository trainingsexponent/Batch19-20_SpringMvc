package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping(value = "/pagecall")
    public String m1() {
		System.out.println("Page Called");
		return "success";
	}
	
}
