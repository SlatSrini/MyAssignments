package week3.day6;

import java.util.*;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		//Input String
		String name = "paypal india";
		
		//Converting String to Character
		char eachchar[] = name.toCharArray();
		
		//Creating Sets
		Set<Character> charset = new HashSet<Character>();
		Set<Character> dupchar = new HashSet<Character>();
		Set<Character> unqset = new HashSet<Character>();
		
		//Adding to charset
		for(int i=0; i<eachchar.length; i++)
		{
			charset.add(eachchar[i]);
		}
		
		System.out.println("Character Set : "+charset);
		
		//Duplicate Char in dupchar set
		int count;
		
		for(int i=0; i<eachchar.length; i++)
		{
			count=0;
			for(int j=i; j<eachchar.length; j++)
			{
				if(eachchar[i]==eachchar[j])
					count++;
			}
			if(count==2)
				dupchar.add(eachchar[i]);
		}
		System.out.println("Duplicate Character : "+dupchar);
		
		//Unique character in unqchar set
		for(int i=0; i<eachchar.length; i++)
		{
			count=0;
			for(int j=0; j<eachchar.length; j++)
			{
				if(eachchar[i]==eachchar[j])
					count++;
			}
			if(count==1)
				unqset.add(eachchar[i]);
		}
		
		//Printing Unique
		System.out.println("Unique Character : "+unqset);
		
		//Removing WhiteSpace
		ArrayList<Character> output = new ArrayList<Character>(unqset);
		
		System.out.print("Output : ");
		
		for(int i =0; i<output.size(); i++)
		{
			count=0;
			if(output.contains(" "))
				count++;
			if(count==0)
				System.out.print(output.get(i)+" ");
		}


	}

}
