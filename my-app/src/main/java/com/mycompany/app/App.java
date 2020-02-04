package com.mycompany.app;

import java.util.ArrayList;
import java.util.List;

/**
 * New Year's gift. Identify the hierarchy of chocolates and other sweets. Create multiple objects of
sweets. Collect children's gift to define total weight. Sort the chocolates in a gift by one of the options.
Find candies in the gift corresponding to a predetermined range of options.
 *
 */
public class App 
{
    public static void main( String[] args )
    {

// Initializing chocolate class objects
        new Chocolates("c1",10);
    	new Chocolates("c2",5);
    	new Chocolates("c3",15);
    	new Chocolates("c4",1);
    	
    	
// Initializing sweet class objects
    	new Sweets("s1",20);
    	new Sweets("s2",30);
    	new Sweets("s3",1);
    	new Sweets("s4",0);
    	
    	
// invoking method in child class
    	Chocolates.sendChocoWeights();

// invoking method in child class   
    	Sweets.sendSweetWeights();
    	
    	
// storing total weight of individual gift-box in a list
    	List<Integer> GiftBox_weight = MyGift.totalweights();
    	
    	
// creating candies list which stores the no.of candies to be returned for a particular gift-box which can be determined by ranges
    	//List<Integer> candies = new ArrayList<>();
    	int total_weight=0;
    	for(int i=0;i<GiftBox_weight.size();i++) {
    		total_weight=total_weight+GiftBox_weight.get(i);
    	/*	if(GiftBox_weight.get(i)<=0) {
    			candies.add(0);
    			
    		}
    	   else if(GiftBox_weight.get(i)>0 && GiftBox_weight.get(i)<20) {
    			candies.add(10);
    		}
    		else if(GiftBox_weight.get(i)>=20 && GiftBox_weight.get(i)<40){
    			candies.add(20);
    		}
    		else if(GiftBox_weight.get(i)>=40 && GiftBox_weight.get(i)<60) {
    			candies.add(40);
    		}
    		else {
    			candies.add(50);
    		}*/
    	}
    	
    	
// printing the candies list for a gift boxes
    	//System.out.println("Candies to be returned for Individual gift box "+candies);
    	System.out.println();
    	System.out.println("Total weight of all Gift Boxes : "+total_weight+" grams");
    	
    	
// invoking sorting method in child class 
    	List<Integer> ChocolateWeights_Sorted = Chocolates.sortChocoWeights();
    	
    	
// printing sorted weights of chocolates
    	System.out.println();
    	System.out.println("Sorted weights of chocolates: "+ChocolateWeights_Sorted);
    	
    	int count1_10 = 0;
    	int count10_20 = 0;
    	int count_20=0;
		for(int i=0;i<GiftBox_weight.size();i++) {
			//System.out.println(candies.get(i));
    		if(GiftBox_weight.get(i)>0 && GiftBox_weight.get(i)<=10) 
    		{
    			count1_10+=1;
    		}
    		else if(GiftBox_weight.get(i)>10 && GiftBox_weight.get(i)<=20) 
    		{
    			count10_20+=1;
    		}
    		else if(GiftBox_weight.get(i)>20) {
    			count_20+=1;
    		}
    	}
		System.out.println();
    	System.out.println("No.of candies in a range 1-10 : "+count1_10);
    	System.out.println("No.of candies in a range 11-20 : "+count10_20);
    	System.out.println("No.of candies in a range above 20 : "+count_20);
  		
    }

	

	
}
