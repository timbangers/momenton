package com.momenton.employee.types;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CEO extends Employee{

	@JsonProperty("employees")
	private List<Manager> managers;

	public List<Manager> getManagers() {
		return managers;
	}

	public void setManagers(List<Manager> managers) {
		this.managers = managers;
	}

	
}
