package com.momenton.employee.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.momenton.employee.dao.EmployeeDAO;
import com.momenton.employee.dao.EmployeeRepository;
import com.momenton.employee.types.CEO;
import com.momenton.employee.types.Employee;
import com.momenton.employee.types.JSONTable;
import com.momenton.employee.types.Manager;


/**
 * This service class is used to process the resultset and construct a json object
 * @author JesseTimbang
 *
 */
@Component
public class EmployeeServiceImpl {
	
	@Autowired
	private EmployeeRepository repo;

	public JSONTable getAllEmployees () {
		List <EmployeeDAO> employees = repo.findAll();
		CEO ceo = new CEO();
		List <Manager> managerList = new ArrayList <Manager>();
		JSONTable table = new JSONTable();
		for (EmployeeDAO emp: employees) {
			//get the ceo
			if (emp.getManagerId() == null) {
				ceo.setName(emp.getName());
				ceo.setEmployeeId(emp.getEmployeeId().intValue());
				break;
			}
		}
		for (EmployeeDAO emp: employees) {
			//get the ceo's subordinates
			if (ceo.getEmployeeId().equals(emp.getManagerId())) {
				Manager manager = new Manager ();
				manager.setName(emp.getName());
				manager.setEmployeeId(emp.getEmployeeId());
				managerList.add(manager);
			}
		}
		
		for (Manager manager:managerList) {
			List <Employee> nonManagers = new ArrayList<Employee>();
			for (EmployeeDAO emp: employees) {
				if (manager.getEmployeeId().equals(emp.getManagerId())) {
					Employee nonManagerEmp = new Employee();
					nonManagerEmp.setName(emp.getName());
					nonManagerEmp.setEmployeeId(emp.getEmployeeId());
					nonManagers.add(nonManagerEmp);
				}
			}
			manager.setNonManagers(nonManagers);
		}
		ceo.setManagers(managerList);
		table.setCeo(ceo);
		return table;
	}

}
