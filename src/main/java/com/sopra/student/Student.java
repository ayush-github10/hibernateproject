package com.sopra.student;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class Student {
	String name;
	@Id
	int id;
	Address adr;
	//@Lob//to store image
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Address getAdr() {
		return adr;
	}
	public void setAdr(Address adr) {
		this.adr = adr;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", adr=" + adr + "]";
	}

}
