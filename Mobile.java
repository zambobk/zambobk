package week1.day1;

public class Mobile {
	
	String mobileBrandName="Apple";
	char mobileLogo='@';
	short noOfMobilePiece=4563;
	int modelNumber=123456789;
	long mobileImeiNumber=12325442422342L;
	float mobilePrice=79999.99999F;
	boolean isDamaged=false;
	
	public static void main(String[] args) {
		
		Mobile phone=new Mobile();
		System.out.println("Mobile brandname: "+phone.mobileBrandName);
		System.out.println(phone.mobileLogo);
		System.out.println(phone.noOfMobilePiece);
		System.out.println(phone.modelNumber);
		System.out.println(phone.mobileImeiNumber);
		System.out.println(phone.mobilePrice);
		System.out.println(phone.isDamaged);
		
	}

}
