package com.ineuron.Entity;

public class Employee {
	
	private Integer eid;
	private String ename;
	
	//constructor dependency
	public Employee(Integer eid, String ename) {
		
		this.eid = eid;
		this.ename = ename;
	}

	public Integer getEid() {
		return eid;
	}

	public String getEname() {
		return ename;
	}
	
	
	

}
