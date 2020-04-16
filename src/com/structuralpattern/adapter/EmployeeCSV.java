package com.structuralpattern.adapter;

import java.util.StringTokenizer;

public class EmployeeCSV {
	private int id;
	private String firstName;
	private String lastname;
	private String emailAddress;
	
	public EmployeeCSV(String values) {
		StringTokenizer tokens = new StringTokenizer(values, ",");
		if(tokens.hasMoreElements()) {
			id = Integer.parseInt(tokens.nextToken());
		}
		if(tokens.hasMoreElements()) {
			firstName = tokens.nextToken();
		}
		if(tokens.hasMoreElements()) {
			lastname = tokens.nextToken();
		}
		if(tokens.hasMoreElements()) {
			emailAddress = tokens.nextToken();
		}
	}
	
	public int getId() {
		return id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}
	

}
