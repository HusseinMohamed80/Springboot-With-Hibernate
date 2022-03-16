package com.springbootwhibernate.springbootwithhibernate.doa;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Query;
import org.hibernate.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springbootwhibernate.springbootwithhibernate.entity.Employee;
@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	private EntityManager entityManager;
	
	@Autowired
	public  EmployeeDaoImpl(EntityManager theEntitymanager) {
		entityManager=theEntitymanager;
	}
	@Override
	@Transactional
	public List<Employee> findAll() {
		//get current hibernate Seeion
		Session se = entityManager.unwrap(Session.class);
		//Create Query
		Query<Employee> query = se.createQuery("From Employee" ,Employee.class);
		//Excute query And get the result
		List<Employee> employees = query.getResultList();
		return employees;
	}

}
