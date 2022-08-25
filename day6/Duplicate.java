package week3.day6;

/*
 * Problem Statement : Print only duplicate values
 * Expected output: 4 and 8
 * 
 * How to solve?
 * 1) Regular for loop
 * 2) Using Set
 * 
 * Using Set 
 * 
 * a) Add every element into Set
 * b) If it is already there in the Set -> Print duplicate
 * 
 */

import java.util.*;

public class Duplicate {

	public static void main(String[] args) {
		
		//Input Data
		int[] data = {4,3,6,8,29,1,2,4,7,8};
		
		//Creating empty Set
		Set<Integer> set = new HashSet<Integer>();
		
		//Logical Loop to get Duplicate
		int count;
		for(int i=0; i<data.length; i++)
		{
			count=0;
			for(int j=i; j<data.length; j++)
			{
				if(data[i]==data[j])
				{
					count++;
				}
			}
			if(count==2)
				set.add(data[i]);
			
		}
		
		//Printing Duplicate
		System.out.println("Duplicate : "+set);

	}

}
