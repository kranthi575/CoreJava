package com.ineuron.entity;

public class Branch {

	private String bid;
	private String bloc;
	
	//constructor injection
	public Branch(String bid, String bloc) {
	
		this.bid = bid;
		this.bloc = bloc;
	}

	//getters
	public String getBloc() {
		return bloc;
	}

	public String getBid() {
		
		return bid;
	}
	
	
	
	
}
