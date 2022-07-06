package com.spring.aero.interfaces;

import org.springframework.data.repository.CrudRepository;

import com.spring.aero.model.Employee;

public interface IntEmpleado extends CrudRepository <Employee,Integer> {

}
