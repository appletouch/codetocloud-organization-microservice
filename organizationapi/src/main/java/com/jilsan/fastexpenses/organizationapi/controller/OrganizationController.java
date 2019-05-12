package com.jilsan.fastexpenses.organizationapi.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jilsan.fastexpenses.organizationapi.dto.OrganizationDTO;

@RestController
public class OrganizationController {
	@SuppressWarnings("serial")
	@GetMapping
	public ArrayList<OrganizationDTO> GetAll() {
		return new ArrayList<OrganizationDTO>() {{add(new OrganizationDTO() {{setName("CodeToCloud");}});}};
	}
	@GetMapping("{id}")
	public OrganizationDTO Get(String id) {
		return new OrganizationDTO() {{setName("New Org");}};
	}
	@PostMapping
	public OrganizationDTO Post(OrganizationDTO org) {
		return new OrganizationDTO() {{setName("New Org");}};
	}
	@DeleteMapping
	public boolean Delete() {
		return true;
	}
	
}
