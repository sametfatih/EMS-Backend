package com.sametfatih.employeemanagementsystem.business.abstacts;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;

import com.sametfatih.employeemanagementsystem.models.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployees();

	Employee createEmployee(Employee employe);

	ResponseEntity<Employee> getEmployeeById(Long id);
	
	ResponseEntity<Employee> updateEmployeeById(Long id, Employee employee);
	
	ResponseEntity<Map<String, Boolean>> deleteEmployeeById(Long id);

}
