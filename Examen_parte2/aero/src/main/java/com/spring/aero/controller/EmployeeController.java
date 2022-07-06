package com.spring.aero.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.aero.model.Employee;
import com.spring.aero.service.EmployeeService;

@RestController
@RequestMapping("apiv1/")
public class EmployeeController {
	
	@Autowired
	private EmployeeService  employeeService;
	
	@GetMapping("empleados/findemployee/{id}")
	public ResponseEntity<Employee> findEmployeeById(@PathVariable long id){
		return ResponseEntity.ok().body(employeeService.findEmployeeById(id));
	}
	
	@GetMapping("empleados/findAll")
	public List<Employee> findAllEmployee(){
		List<Employee> lista = employeeService.findAllEmployee();
		return lista;
	}
	
	@PutMapping("empleados/Update")
	public ResponseEntity<Employee> updateEmployee(@PathVariable long id, @RequestBody Employee employee){
		employee.setId((int) id);
		return ResponseEntity.ok().body(this.employeeService.updateEmployee(employee));	
	}
	
	@DeleteMapping("empleado/delete/{id}")
	public  HttpStatus deleteEmploye(@PathVariable long id) {
		this.deleteEmploye(id);
		return HttpStatus.OK;
	}
	
	@PostMapping(value= "/empleado/add",consumes = {"application/json"})
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
		return ResponseEntity.ok(this.employeeService.addEmployee(employee));
	}
	

}
