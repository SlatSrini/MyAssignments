package week3.day6;

import java.util.*;

public class Intersection {

	public static void main(String[] args) {
		
		// Input Datas
		int[ ] a = {3,2,11,4,6,7};
		int[ ] b = {1,2,8,4,9,7};
		
		//Creating ArrayList
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		//Logical for Loop to get Common Number in both array
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<b.length; j++)
			{
				if(a[i]==b[j])
					list.add(a[i]);
			}
		}
		
		//Print Intersection
		System.out.println("Intersected List : "+list);

	}

}
