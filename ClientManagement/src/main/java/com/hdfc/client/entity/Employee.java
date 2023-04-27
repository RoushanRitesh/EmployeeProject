package com.hdfc.client.entity;

import java.sql.Date;

public class Employee {
private int employeeId;
private String employeeName;
private Date DateOfBirth;
public Employee(int employeeId, String employeeName, Date dateOfBirth) {
	super();
	this.employeeId = employeeId;
	this.employeeName = employeeName;
	DateOfBirth = dateOfBirth;
}
public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public Date getDateOfBirth() {
	return DateOfBirth;
}
public void setDateOfBirth(Date dateOfBirth) {
	DateOfBirth = dateOfBirth;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
}
