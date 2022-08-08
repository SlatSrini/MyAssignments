package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		System.out.println("Addition : "+cal.add(12, 8, 11));
		System.out.println("Subtraction : "+cal.sub(32, 26));
		System.out.println("Multiplication : "+cal.mul(21, 14));
		System.out.println("Division : "+cal.div(36, 6));

	}

}
