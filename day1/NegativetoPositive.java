package week1.day1;

public class NegativetoPositive {

	public static void main(String[] args) {
		
		int num = -40;
		
		if(num<0)
		{
			num=num-num-num;
			System.out.println("Converted Positive Number is "+num);
		}
		else 
		{
			System.out.println(num+" is a Positive Number Only!!!");
		}



	}

}
