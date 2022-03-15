package com.springbootwhibernate.springbootwithhibernate.doa;

import java.util.List;

import com.springbootwhibernate.springbootwithhibernate.entity.Employee;

public interface EmployeeDao {

	public List<Employee> findAll();
}
