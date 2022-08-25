package week3.day6;

import java.util.*;

public class UniqueCharacter {

	public static void main(String[] args) {
		
		//Input String 
		String name = "srinivasan";
		int count;
		
		//Converting String Char Array
		char name_char[] = name.toCharArray();
		
		//Creating HashSet
		Set<Character> set = new HashSet<Character>();
		
		//Logical for Loop to get unique
		for(int i=0; i<name_char.length; i++)
		{
			count=0;
			for(int j=0; j<name_char.length; j++)
			{
				if(name_char[i]==name_char[j])
					count++;
			}
			if(count==1)
				set.add(name_char[i]);
		}
		
		//Printing Unique
		System.out.println("Unique Character : "+set);

	}

}
