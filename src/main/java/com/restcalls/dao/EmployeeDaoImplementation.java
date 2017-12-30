package com.restcalls.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.restcalls.model.Employee;

@Repository
public class EmployeeDaoImplementation implements EmployeeDao{

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public List<Employee> getEmployees() {

		List<Employee> employees = hibernateTemplate.loadAll(Employee.class);
		return employees;
	}

}
