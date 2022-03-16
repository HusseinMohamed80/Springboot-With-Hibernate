package com.springbootwhibernate.springbootwithhibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootwhibernate.springbootwithhibernate.doa.EmployeeDao;
import com.springbootwhibernate.springbootwithhibernate.entity.Employee;

@RestController
@RequestMapping("/api")
public class EmployeeControllerRest {

	private EmployeeDao empDao;

	@Autowired
	public EmployeeControllerRest(EmployeeDao TheEmpDao) {

		empDao = TheEmpDao;
	}
	
	
	@GetMapping("/Employee")
	public List<Employee> findAllEmp()
	{
		
		return empDao.findAll();
		
	}
	
	
	
}
