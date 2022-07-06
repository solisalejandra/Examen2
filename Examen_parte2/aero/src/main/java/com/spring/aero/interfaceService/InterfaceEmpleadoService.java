package com.spring.aero.interfaceService;

import java.util.List;
import java.util.Optional;

import com.spring.aero.model.Employee;

public interface InterfaceEmpleadoService {
	
	public List <Employee>listar();
	public Optional <Employee>listarId(int id);
	public int save (Employee e);
	public void delete(int id) throws Exception;
	public Employee createEmpleado(Employee empleado);
	public String updateEmpleado(Employee empleado);
	

}
