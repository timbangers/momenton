package com.momenton.employee.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.momenton.employee.exception.EmployeeException;
import com.momenton.employee.service.EmployeeServiceImpl;
import com.momenton.employee.types.JSONTable;

/**
 * This rest controller returns a json object representing the hierarchical structure of the company
 * @author JesseTimbang
 *
 */
@RestController
@RequestMapping(path = "momenton")
public class EmployeeController {
	
	@Autowired
	EmployeeServiceImpl service;

    @GetMapping(path="employees", produces = "application/json")
    public JSONTable getEmployees() throws EmployeeException 
    {
    	return service.getAllEmployees();
    }
}
