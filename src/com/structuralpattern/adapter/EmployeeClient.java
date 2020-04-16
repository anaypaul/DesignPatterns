package com.structuralpattern.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {
	
	public List<Employee> getEmployeeList(){
		
		List<Employee> employees = new ArrayList<>();
		
		
		//Data coming from EmployeeDB object fetched from database. 
		EmployeeDB employeeDb = new EmployeeDB("1234", "John", "Wick", "JohnW@abc.com");
		
		employees.add(employeeDb);
		
		
		//Data coming from EmployeeLdap object fetched from Ldap. 
		//the next two lines don't work with and adapter. 
		// EmployeeLdap employeeLdap = new EmployeeLdap("chowie", "Sol", "Han", "hans@sol.com");
		//employees.add(employeeLdap);
		
		//So we will make use of an Adapter for data fetched from Ldap, as Ldap is legacy code and we don't change anything 
		//in the EmployeeLdap's implementation.
		
		EmployeeLdap employeeLdap = new EmployeeLdap("chowie", "Sol", "Han", "hans@sol.com");
		
		employees.add(new EmployeeAdapterLdap(employeeLdap));
		
		
		// For data coming from 3rd source. Let's say a CSV file. 
		//He would need another adapter for CSV fetched employee data.
		EmployeeCSV employeeCSV = new EmployeeCSV("12145,Anay,Paul,apaul22@asu.edu");
		
		employees.add(new EmployeeAdapterCSV(employeeCSV));
		
		
		return employees;
	}

}
