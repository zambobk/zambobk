package week1.day1;

public class TwoWheeler {
	
	int noofWheels=2;
	short noofMirrors=2;
	long chassisNumber=12334242424390l;
	boolean isPunctured=false;
	String bikename="Royal Enfield";
	double runningKM=46737.34;
	
	public static void main(String[] args) {
	
		TwoWheeler bike=new TwoWheeler();
		System.out.println(bike.noofWheels);
		System.out.println(bike.noofMirrors);
		System.out.println(bike.chassisNumber);
		System.out.println(bike.isPunctured);
		System.out.println("bikename: "+bike.bikename);
		System.out.println(bike.runningKM);
	}

}
