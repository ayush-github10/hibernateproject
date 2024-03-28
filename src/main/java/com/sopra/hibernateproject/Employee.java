package com.sopra.hibernateproject;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity(name="employee")
public class Employee {
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)//identity alters in same table
	int id;
	@Column(name="emp_name")
	String name;
	@Temporal(TemporalType.DATE)//to map the date or time with entry in database
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

}
