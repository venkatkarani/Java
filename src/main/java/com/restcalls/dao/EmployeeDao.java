package com.restcalls.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.restcalls.model.Employee;

@Component
public interface EmployeeDao {

	public List<Employee> getEmployees();
}
