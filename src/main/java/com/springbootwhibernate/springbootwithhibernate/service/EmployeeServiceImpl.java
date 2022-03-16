package com.springbootwhibernate.springbootwithhibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springbootwhibernate.springbootwithhibernate.doa.EmployeeDao;
import com.springbootwhibernate.springbootwithhibernate.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao empDao;

	@Autowired
	public EmployeeServiceImpl(EmployeeDao empDao) {

		this.empDao = empDao;
	}

	@Override
	@Transactional
	public List<Employee> findAll() {

		return empDao.findAll();
	}

	@Override
	@Transactional
	public Employee findById(int theId) {
 
		return empDao.findById(theId);
	}

	@Override
	@Transactional
	public void saveEmp(Employee theEmployee) {
		empDao.saveEmp(theEmployee);
		
	}

	@Override
	@Transactional
	public void deleteEmp(int theId) {
		empDao.deletebyId(theId);
		
	}

}
