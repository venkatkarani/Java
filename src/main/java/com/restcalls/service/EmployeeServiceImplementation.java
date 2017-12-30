package com.restcalls.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.restcalls.dao.EmployeeDao;
import com.restcalls.model.Employee;

@Service
public class EmployeeServiceImplementation implements EmployeeService{
	
	@Autowired
	private EmployeeDao employeeDao;

	public List<Employee> getEmployees() {
		
		List<Employee> employees = employeeDao.getEmployees();
		return employees;
	}

}
