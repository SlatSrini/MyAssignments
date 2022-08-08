package week1.day2;

public class DuplicateinArray {

	public static void main(String[] args) {
		
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int count;
		
		System.out.print("Duplicate Numbers in Array : ");
		
		for (int i=0; i<arr.length; i++)
		{
			count =0;
			for (int j=i; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}			
			}
			if(count==2)
				System.out.print(arr[i]+" ");
		}

	}

}
