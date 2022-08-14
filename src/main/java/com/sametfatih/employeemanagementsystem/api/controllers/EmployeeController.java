package com.sametfatih.employeemanagementsystem.api.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sametfatih.employeemanagementsystem.business.abstacts.EmployeeService;
import com.sametfatih.employeemanagementsystem.models.Employee;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	
	@PostMapping("/employees")
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeeService.createEmployee(employee);
	}
	
	@GetMapping("/employees/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) {
		return employeeService.getEmployeeById(id);
	}
	
	@PutMapping("/employees/{id}")
	public ResponseEntity<Employee> updateEmployeeById(@PathVariable Long id,@RequestBody Employee employeeDetails){
		return employeeService.updateEmployeeById(id, employeeDetails);
	}
	
	@DeleteMapping("/employees/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteEmployeeById(@PathVariable Long id){
		return employeeService.deleteEmployeeById(id);
	}
}
