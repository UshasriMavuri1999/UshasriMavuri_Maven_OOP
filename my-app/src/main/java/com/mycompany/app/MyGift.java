package com.mycompany.app;

import java.util.ArrayList;
import java.util.List;


public class MyGift {


	 static List<Integer> ChocolatesWeights = new ArrayList<>();
	 static List<Integer> SweetsWeights = new ArrayList<>();
	 static List<Integer> TotalWeights = new ArrayList<>();

	public MyGift(List<Integer> chocolatesWeights) {
		// TODO Auto-generated constructor stub
		ChocolatesWeights=chocolatesWeights;
		
	}
	
	public MyGift(String string) {
		// TODO Auto-generated constructor stub
		//System.out.println(string);
	}

	public MyGift() {
		// TODO Auto-generated constructor stub
	}

	public void sendSweetWeights(List<Integer> sweetWeights) {
		// TODO Auto-generated method stub
		SweetsWeights=sweetWeights;
	}

	public static List<Integer> totalweights() {
		// TODO Auto-generated method stub
		for(int i=0;i<ChocolatesWeights.size();i++) {
			
			TotalWeights.add(ChocolatesWeights.get(i)+SweetsWeights.get(i));
			System.out.println("Weight of Gift-"+(i+1)+" is : "+TotalWeights.get(i)+" grams");
				
		}
		return TotalWeights;
		
		
	}
	
	

}
