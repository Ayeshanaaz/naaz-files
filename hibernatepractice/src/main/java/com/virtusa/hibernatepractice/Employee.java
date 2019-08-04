package com.virtusa.hibernatepractice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.SQLUpdate;

@Entity
@Table(name="employee")
public class Employee {
	public Employee() {
		super();
	}
	@Id
	@Column(name="class_id",length=10)
	private int id;
	private String name;
	private String company;
	private boolean rahul;
	private float salary;
	private SQLUpdate date;
	public Employee(int id, String name, String company) {
		super();
		this.id = id;
		this.name = name;
		this.company = company;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", company=" + company + "]";
	}
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
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	

}
