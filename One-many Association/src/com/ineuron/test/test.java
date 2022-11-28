package com.ineuron.test;

import com.ineuron.Entity.Department;
import com.ineuron.Entity.Employee;

public class test {
	
	public static void main(String args[]) {
	Employee emp1=new Employee(10,"Sachin");
	Employee emp2=new Employee(18,"Kohli");
	Employee emp3=new Employee(19,"ROhit");
	
	Employee[] employees=new Employee[3];
	
	employees[0]=emp1;
	employees[1]=emp2;
	employees[2]=emp3;
	
	Department dept=new Department(14, "CSE","HYD",employees);
	
	dept.display();
	}
	

}
