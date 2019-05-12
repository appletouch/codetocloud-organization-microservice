package com.jilsan.fastexpenses.organizationapi.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.jilsan.fastexpenses.organizationapi.dto.EmployeeDTO;

import com.jilsan.fastexpenses.organizationapi.services.OrganizationService;
@RestController
@RequestMapping("employee")

public class EmployeeController {
	private OrganizationService service;

	public EmployeeController(OrganizationService service) {
		this.service =service;
	}
	@GetMapping("{id}")
	public EmployeeDTO Get(@PathVariable String id) {
	  return	service.getEmployeeById(id);
	}
	
	
	
}
