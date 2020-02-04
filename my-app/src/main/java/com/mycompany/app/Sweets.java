package com.mycompany.app;

import java.util.ArrayList;
import java.util.List;

public class Sweets extends MyGift{
	List<String> SweetNames = new ArrayList<>();
	static List<Integer> SweetWeights = new ArrayList<>();
	private String Sname;
	private int Sweight;

	public Sweets(String Sname, int d) {
		// TODO Auto-generated constructor stub
		super("Sweet Class Constructor calling MyGift class Constructor");
		this.setSname(Sname);
		this.setSweight(d);
		SweetNames.add(Sname);
		SweetWeights.add(d);	
	}

	/**
	 * @return the sname
	 */
	public String getSname() {
		return Sname;
	}

	/**
	 * @param sname the sname to set
	 */
	public void setSname(String sname) {
		Sname = sname;
	}

	/**
	 * @return the sweight
	 */
	public double getSweight() {
		return Sweight;
	}

	/**
	 * @param d the sweight to set
	 */
	public void setSweight(int d) {
		Sweight = d;
	}

	public static void sendSweetWeights() {
		// TODO Auto-generated method stub
		MyGift g1=new MyGift();
		g1.sendSweetWeights(SweetWeights);
		
	}

	

}
