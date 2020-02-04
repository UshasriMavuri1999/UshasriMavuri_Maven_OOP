package com.mycompany.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Chocolates extends MyGift {
//list to store chocolate names
	List<String> ChocoNames = new ArrayList<>();
//list to store chocolate weights
	static List<Integer> ChocoWeights = new ArrayList<>();
	private String Cname;
	private int Cweight;
	
//parameterized constructor
	public Chocolates(String Cname,int Cweight) {
//chocolate class is calling super class constructor
		super("Chocolate Class Constructor calling MyGift class Constructor");
		this.setCname(Cname);
		this.setCweight(Cweight);
		ChocoNames.add(Cname);
		ChocoWeights.add(Cweight);
	}
	
//method to send chocolate weights to parent class i.e; MyGift class
	public static void sendChocoWeights() {
		// TODO Auto-generated method stub
//initializing MyGift class i.e; parent class object
		new MyGift(ChocoWeights);	
	}
	public int getCweight() {
		return Cweight;
	}
	public void setCweight(int cweight) {
		Cweight = cweight;
	}
	public String getCname() {
		return Cname;
	}
	public void setCname(String cname) {
		Cname = cname;
	}
//method to sort the chocolate weights
	public static List<Integer> sortChocoWeights() {
		// TODO Auto-generated method stub
		Collections.sort(ChocoWeights);
		return ChocoWeights;
		
		
	}
	

	

}
