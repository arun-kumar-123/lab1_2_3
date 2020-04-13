package com.org.lab4th.emp.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
 private int id;
 private String name;
 private double salary;
 
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
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
@Autowired
public Employee(int id, String name, double salary) {
	super();
	this.id=id;
	this.name=name;
	this.salary=salary;
}
}
