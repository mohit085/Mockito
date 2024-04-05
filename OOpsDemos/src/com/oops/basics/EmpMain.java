package com.oops.basics;

public class EmpMain {
	
	public static void main(String[] args) {
		Employee employee1 = new Employee();
		employee1.employeeName ="Raju";
		employee1.employeeId=12;
		employee1.salary=2000;
//		System.out.println("Name "+employee1.employeeName);
//		System.out.println("Id "+employee1.employeeId);
//		System.out.println("salary "+employee1.salary);
		
		Employee employee2 =  employee1;
		
		System.out.println("Name "+employee1.employeeName);
		System.out.println("Name "+employee2.employeeName);
		
		employee2.employeeName="Mohit";
		System.out.println("Name "+employee1.employeeName);
		System.out.println("Name "+employee2.employeeName);
		
		employee1.employeeName=null;
		System.out.println("Name "+employee1.employeeName);
		System.out.println("Name "+employee2.employeeName);
	}
}
