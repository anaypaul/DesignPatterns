package com.structuralpattern.adapter;

import java.util.List;

public class AdapterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeClient client = new EmployeeClient();
		
		List<Employee> employees = client.getEmployeeList();
		
		
		for(Employee e : employees) {
			System.out.print(e.getClass()+" --> ");
			System.out.println(e);
		}
	}

}
