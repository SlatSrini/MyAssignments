package week1.day2;

public class Fibbinocci {

	public static void main(String[] args) {
		
		int a=0,b=1,sum=0;
		
		System.out.print("Fibbinocci Series : "+a+" ");
		System.out.print(b+" ");
		
		for (int i=1; i<=11; i++)
		{
			sum=a+b;
			a=b;
			b=sum;
			System.out.print(sum+" ");
		}

	}

}
