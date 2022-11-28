package com.ineuron.entity;

public class Student {

	private Integer sid;
	private String sname;
	private Integer sage;
	
	private Branch branch;

	public Student(Integer sid, String sname, Integer sage, Branch branch) {
		
		this.sid = sid;
		this.sname = sname;
		this.sage = sage;
		this.branch = branch;
	}
	
	public void display() {
		
		System.out.println("===========Student Details============");
		System.out.println("Student ID: "+sid);
		System.out.println("Student Name: "+sname);
		System.out.println("Student Location: "+sage);
		
		System.out.println("--------------------------------------");
		
		System.out.println("Branch Details are :: ");
		System.out.println("Branch Id: "+branch.getBid());
		System.out.println("Branch Name: "+branch.getBloc());
		
	}
	
	
}
