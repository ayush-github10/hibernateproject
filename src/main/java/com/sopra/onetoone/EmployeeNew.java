package com.sopra.onetoone;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class EmployeeNew {
	@Id
	
	@OneToOne//for mapping
	int empid;
	String empname;
	ContactDetails cd;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public ContactDetails getCd() {
		return cd;
	}
	public void setCd(ContactDetails cd) {
		this.cd = cd;
	}
	@Override
	public String toString() {
		return "EmployeeNew [empid=" + empid + ", empname=" + empname + ", cd=" + cd + "]";
	}
	
}
