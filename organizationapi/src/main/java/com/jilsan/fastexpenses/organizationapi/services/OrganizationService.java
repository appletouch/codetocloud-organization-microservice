package com.jilsan.fastexpenses.organizationapi.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import org.springframework.stereotype.Component;

import com.jilsan.fastexpenses.organizationapi.dto.EmployeeDTO;
import com.jilsan.fastexpenses.organizationapi.dto.OrganizationDTO;

@Component

public class OrganizationService {
	
    HashMap<String,EmployeeDTO> employeeMap= new HashMap<String,EmployeeDTO>();	   
    HashMap<String,OrganizationDTO> orgMap= new HashMap<String,OrganizationDTO>();
    public OrganizationService() {
    	createEmployeeRecords();
    }
	public EmployeeDTO getEmployeeById(String Id) {
		return employeeMap.get(Id);
	}
	public OrganizationDTO getOrganizationById(String Id) {
		return orgMap.get(Id);
	}
	
	private void createEmployeeRecords() {
		employeeMap.put("41255",new EmployeeDTO() {
			
			{
				setEmpEmail("jsalk@polio.com");
				setEmpName("Jonas Salk");
				setEmpid("41255");
				setOrganization(new OrganizationDTO() {{setName("Jonas Salk Institute");
										setAllowedExpenses(Arrays.asList(new String[] {"Meals","Flight","Car","Hotels"}) );
				}});
		}		});
	}
}

