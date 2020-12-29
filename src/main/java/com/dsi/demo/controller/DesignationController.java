package com.dsi.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.dsi.demo.model.Designation;

@Controller
public class DesignationController {
	
	@GetMapping("/add")
	public String addDesignation(Designation designation) {
		return "AddDesignation";
	}
	
	@GetMapping("/edit")
	public String editDesignation(Designation designation) {
		return "EditDesignation";
	}
	
	@GetMapping("/show")
	public String showList(Designation designation) {
		return "ShowList";
	}
}
