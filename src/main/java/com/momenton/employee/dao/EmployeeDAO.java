package com.momenton.employee.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

/**
 * This class is the entity for the employees table, each field representing a column in it.
 * @author JesseTimbang
 *
 */
@Entity
@Table(name = "employees")
public class EmployeeDAO {

	@Id
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "employee_name")
	@NonNull
	private String name;
	
	@Column(name = "employee_id")
	@NonNull
	private Integer employeeId;
	
	@Column(name = "manager_id")
	@Nullable
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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
