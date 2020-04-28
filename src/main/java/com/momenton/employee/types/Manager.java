package com.momenton.employee.types;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Manager extends Employee{
	
	@JsonProperty("employees")
	private List <Employee> nonManagers;

	public List<Employee> getNonManagers() {
		return nonManagers;
	}

	public void setNonManagers(List<Employee> nonManagers) {
		this.nonManagers = nonManagers;
	}
}

