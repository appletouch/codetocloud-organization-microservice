package com.jilsan.fastexpenses.organizationapi.dto;

public class OrganizationDTO {
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public AddressDTO getAddress() {
		return address;
	}
	public void setAddress(AddressDTO address) {
		this.address = address;
	}
	public String getAdministrator() {
		return administrator;
	}
	public void setAdministrator(String administrator) {
		this.administrator = administrator;
	}
	public String getAddministratorEmail() {
		return addministratorEmail;
	}
	public void setAddministratorEmail(String addministratorEmail) {
		this.addministratorEmail = addministratorEmail;
	}
	String name;
	AddressDTO address;
	String administrator;
	String addministratorEmail;
}
