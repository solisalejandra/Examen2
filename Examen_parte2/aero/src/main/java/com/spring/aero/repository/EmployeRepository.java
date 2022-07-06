package com.spring.aero.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.aero.model.Employee;

@Repository
public interface EmployeRepository extends JpaRepository<Employee, Long> {

}
