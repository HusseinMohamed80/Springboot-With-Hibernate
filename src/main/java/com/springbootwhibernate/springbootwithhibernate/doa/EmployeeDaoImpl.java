package com.springbootwhibernate.springbootwithhibernate.doa;

import java.util.List;

import javax.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.springbootwhibernate.springbootwithhibernate.entity.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	private EntityManager entityManager;

	@Autowired
	public EmployeeDaoImpl(EntityManager theEntitymanager) {
		entityManager = theEntitymanager;
	}

	@Override
	public List<Employee> findAll() {
		// get current hibernate Session
		Session se = entityManager.unwrap(Session.class);
		// Create Query
		Query<Employee> query = se.createQuery("From Employee", Employee.class);
		// Execute query And get the result
		List<Employee> employees = query.getResultList();
		return employees;
	}

	@Override
	public Employee findById(int theId) {
		Session se = entityManager.unwrap(Session.class);
		Employee employee = se.get(Employee.class, theId);
		return employee;
	}

	@Override
	public void saveEmp(Employee theEmployee) {
		Session se = entityManager.unwrap(Session.class);
		se.saveOrUpdate(theEmployee);
		;

	}

	@Override
	public void deletebyId(int theId) {
	Session se = entityManager.unwrap(Session.class);
	Query theQuery = se.createQuery("delete from Employee where id=:employeeid");
	theQuery.setParameter("employeeid", theId);
	theQuery.executeUpdate();
		
	}

}
