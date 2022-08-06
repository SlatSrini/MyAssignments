package week1.day1;

public class TwoWheeler {
	
	int wheelcount=2;
	short mirrorcount=2;
	long chasisno=52341726345L;
	boolean ispunctured = false;
	String bikename = "ApacheRTR";
	double Kmdriven=31764.70;

	public static void main(String[] args) {
		
		TwoWheeler tw = new TwoWheeler();
		System.out.println("TwoWheeler Particulers :");
		System.out.println();
		System.out.println("BikeName : "+tw.bikename);
		System.out.println("KM Driven : "+tw.Kmdriven);
		System.out.println("No.Of.Wheels : "+tw.wheelcount);
		System.out.println("No.Of.Mirrors : "+tw.mirrorcount);
		System.out.println("Chasis No : "+tw.chasisno);
		System.out.println("IsPunctured : "+tw.ispunctured);	

	}

}
