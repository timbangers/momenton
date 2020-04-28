package com.momenton.employee.types;

import org.springframework.lang.NonNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Employee {
	private String name;
	
	@JsonIgnore
	private Integer employeeId;
	
	@JsonIgnore
	private Integer managerId;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public Integer getManagerId() {
		return managerId;
	}
	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}
}
