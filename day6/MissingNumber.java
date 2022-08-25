package week3.day6;

/*
 * Problem 
 * 
 * There will be running number between 1 to 10
 * One of the unique number will be missing
 * Find the missing number
 * 
 * 
 */

/*
 * Psuedocode
 * 
 * a) Remove the duplicates using Set
 * b) Make sure the set is in the ascending order
 * c) Iterate from the starting number and verify the next number is + 1
 * d) If did not match, that is the number
 * 
 */

import java.util.*;

public class MissingNumber {

	public static void main(String[] args) {
		
		//Input data
		int arr[] = {1,3,2,5,6,9,4,3,5,7,10};
		
		//Removing Duplicate Using Set
		Set<Integer> set = new TreeSet<Integer>();
		
		//Adding data to Set
		for(int i=0; i<arr.length; i++)
		{
			set.add(arr[i]);
		}
		
		System.out.println("TreeSet : "+set);
		
		//Converting to ArrayList
		ArrayList<Integer> list = new ArrayList<Integer>(set);
		
		//Verifying with Next Number
		int num = 1;
		
		//Logical for Loop
		for(int i=0; i<list.size(); i++)
		{
			if(list.get(i)==num)
				num++;
			else
			{
				//Print missing Number & break the Loop
				System.out.println("Missing Number is : "+num);
				break;
			}
		}

	}

}
