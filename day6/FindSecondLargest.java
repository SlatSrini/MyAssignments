package week3.day6;

import java.util.*;

//Here is the input
		// int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		//       output= 7;

		/*
		 * Pseudo Code: 
		 * a) Create a empty Set Using TreeSet
		 * b) Declare for loop iterator from 0 to data.length and add into Set 
		 * c) converted Set into List
		 * d) Print the second last element from List
		 * 
		 * 
		 */
public class FindSecondLargest {

	public static void main(String[] args) {
		
		// Input Data
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		
		// To Find Length of Array
		int len = data.length;
		
		//Creating Empty Set
		Set<Integer> set = new TreeSet<Integer>();
		
		//Iterating Each Array Value into Set
		for(int i=0; i<len; i++)
		{
			set.add(data[i]);
		}
		
		//Printing Set
		System.out.println("Set : "+set);
		
		//Converting Set to ArrayList
		List <Integer> list = new ArrayList<Integer>(set);
		
		//Printing Secong Largest
		System.out.println("Secong Largest is : "+list.get(list.size()-2));

	}

}
