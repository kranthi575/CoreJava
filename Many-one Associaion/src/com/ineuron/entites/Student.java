package com.ineuron.entites;

public class Student {

	private Integer sid;
	private String sname;
	private Integer sage;
	
	private Branch branch[];

	public Student(Integer sid, String sname, Integer sage, Branch branch[]) {
		
		this.sid = sid;
		this.sname = sname;
		this.sage = sage;
		this.branch= branch;
	}
	
	public void display() {
		
		System.out.println("===========Student Details============");
		System.out.println("Student ID: "+sid);
		System.out.println("Student Name: "+sname);
		System.out.println("Student Location: "+sage);
		
		System.out.println("--------------Branch Details-------------");
		for(Branch b:branch) {
			
			System.out.println("Branch ID: "+b.getBid());
			System.out.println("Branch Location: "+b.getBloc());
			System.out.println("____________________________________");
		}
		
	}
	
	
	
	
}
