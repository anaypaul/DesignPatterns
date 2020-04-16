package com.structuralpattern.adapter;

public class EmployeeAdapterCSV implements Employee {
	private EmployeeCSV instance;
	
	public EmployeeAdapterCSV(EmployeeCSV employeeCSV) {
		this.instance = employeeCSV;
	}
	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return instance.getId() + "";
	}

	@Override
	public String getFirstName() {
		// TODO Auto-generated method stub
		return instance.getFirstName();
	}

	@Override
	public String getLastName() {
		// TODO Auto-generated method stub
		return instance.getLastname();
	}

	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return instance.getEmailAddress();
	}
	
	public String toString() {
		return "ID: " + instance.getId() + ", First name: " + instance.getFirstName() + ", Last name: " + instance.getLastname() + ", Email: " + instance.getEmailAddress();
	}

}
