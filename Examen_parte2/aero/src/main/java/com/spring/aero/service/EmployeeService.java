package com.spring.aero.service;

import java.util.List;

import com.spring.aero.model.Employee;

public interface EmployeeService {
	
	Employee findEmployeeById(long employeeid);
	List <Employee> findAllEmployee();
	void deleteEmployee(long employeeid);
	Employee updateEmployee (Employee employee);
	Employee addEmployee(Employee employee);
	

}
