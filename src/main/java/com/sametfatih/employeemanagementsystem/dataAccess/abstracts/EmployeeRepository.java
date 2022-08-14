package com.sametfatih.employeemanagementsystem.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sametfatih.employeemanagementsystem.models.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
