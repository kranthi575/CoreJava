package com.ineuron.Entity;

import java.util.Arrays;

public class Department {
	
	Integer deptno;
	String deptName;
	String deptLoc;
	private Employee[] employees;
	
	public Department(Integer deptno, String deptName, String deptLoc, Employee[] employees) {
		super();
		this.deptno = deptno;
		this.deptName = deptName;
		this.deptLoc = deptLoc;
		this.employees = employees;
	}

	
	
	public void display() {
		
		System.out.println("**************Department Details****************");
		System.out.println("Department number :"+deptno);
		System.out.println("Department Name :"+deptName);
		System.out.println("Department Location :"+deptLoc);
		
		System.out.println("**************Employee Details*******************");
		for(Employee emp:employees) {
			
			System.out.println("Employee ID : "+emp.getEid());
			System.out.println("Emploee Name : "+emp.getEname());
			System.out.println(" ");
		}
	
	}
	
	
	
	
	
	
	
	
	

}
