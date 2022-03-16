package com.springbootwhibernate.springbootwithhibernate.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springbootwhibernate.springbootwithhibernate.entity.Employee;
import com.springbootwhibernate.springbootwithhibernate.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeControllerRest {

	private EmployeeService empServ;

	public EmployeeControllerRest(EmployeeService empServ) {

		this.empServ = empServ;
	}

	@GetMapping("/employee")
	public List<Employee> findAllEmp() {

		return empServ.findAll();

	}

	@GetMapping("/employee/{employeeId}")
	public Employee findById(@PathVariable int employeeId) {

		return empServ.findById(employeeId);

	}

	@PostMapping("/employee")
	public void save(@RequestBody Employee theEmp) {
		theEmp.setId(0);
		empServ.saveEmp(theEmp);

	}

	@PutMapping("/employee")
	public void Update(@RequestBody Employee theEmp) {

		empServ.saveEmp(theEmp);

	}

	@DeleteMapping("/employee/{employeeId}")
	public void deleteById(@PathVariable int employeeId) {

		empServ.deleteEmp(employeeId);

	}
}
