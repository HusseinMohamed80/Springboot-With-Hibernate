package com.springbootwhibernate.springbootwithhibernate.service;

import java.util.List;

import com.springbootwhibernate.springbootwithhibernate.entity.Employee;

public interface EmployeeService {
	public List<Employee> findAll();

	public Employee findById(int theId);

	public void saveEmp(Employee theEmployee);
	public void deleteEmp(int theId);

}
