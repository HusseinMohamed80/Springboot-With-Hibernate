package com.springbootwhibernate.springbootwithhibernate.entity;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class Employee {
	private int id;
	private String FirstName;
	private String LastName;

	public Employee() {

	}

	public Employee(int id, String firstName, String lastName) {

		this.id = id;
		FirstName = firstName;
		LastName = lastName;
	}

	
}
