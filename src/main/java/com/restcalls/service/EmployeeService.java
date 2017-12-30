package com.restcalls.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.restcalls.model.Employee;

@Component
public interface EmployeeService {

	public List<Employee> getEmployees();
}
