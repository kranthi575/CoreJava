package com.ineuron.entites;

public class Test {

	
	public static void main(String[] args) {
		
		
		Branch branch[]=new Branch[3];
		
		branch[0]=new Branch("2K09","SUYPT");
		
		branch[1]=new Branch("1M07","Hyd");
		
		branch[2]=new Branch("1Q90","VJW");
		
		Student student[]=new Student[3];
		
		student[0]=new Student(10,"Sachin",40,branch);
		
		student[1]=new Student(07,"Dhoni",49,branch);
		
		student[2]=new Student(9,"Rohit",30,branch);
		
		for(Student s:student) {
			//System.out.println("#############Student###########");
			s.display();
		}
		
	}
}
