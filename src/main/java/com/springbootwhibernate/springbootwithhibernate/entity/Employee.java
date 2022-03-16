package com.springbootwhibernate.springbootwithhibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Employee {
	@Id
	private int id;
	@Column(name = "first_name")
	private String FirstName;
	@Column(name = "last_name")
	private String LastName;

	public Employee() {

	}

	public Employee(int id, String firstName, String lastName) {

		this.id = id;
		FirstName = firstName;
		LastName = lastName;
	}

}
