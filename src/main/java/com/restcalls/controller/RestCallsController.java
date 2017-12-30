package com.restcalls.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.restcalls.model.Employee;
import com.restcalls.service.EmployeeService;

@RestController
public class RestCallsController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/map")
	public String welcome() {
		return "Welcome to rest service call";
	}
		
	@RequestMapping(value="/employees", method=RequestMethod.GET, produces="application/json")
	public List<Employee> getEmployees() {
		List<Employee> employees = employeeService.getEmployees();
		return employees;
	}
}
