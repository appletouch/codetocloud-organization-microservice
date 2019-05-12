package com.jilsan.fastexpenses.organizationapi.dto;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDTO {
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public List<String> getAllowedExpenses() {
		return allowedExpenses;
	}
	public void setAllowedExpenses(List<String> list) {
		this.allowedExpenses = list;
	}
	public OrganizationDTO getOrganization() {
		return Organization;
	}
	public void setOrganization(OrganizationDTO organization) {
		Organization = organization;
	}
	String empid;
	String empName;
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	String empEmail;
	List<String> allowedExpenses ; 
	OrganizationDTO Organization;
}


