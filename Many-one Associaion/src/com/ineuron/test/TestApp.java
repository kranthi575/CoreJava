package com.ineuron.test;

import com.ineuron.entity.Branch;
import com.ineuron.entity.Student;

public class TestApp {
	
	
	public static void main(String[] args) {
		
	Branch branch=new Branch("1N007","Kodad");
	
	Student s1=new Student(10,"sachin",49,branch);
	
	s1.display();
	
	Student s2=new Student(07,"Dhoni",40,branch);
	
	s2.display();
	
	
	

	}
}
