package week2.day2;

public class Mobile {
	public void makeCall() {
		String mobileModel="Samsung";
		float mobileWeight=12.43f;	
		System.out.println(mobileModel);
		System.out.println(mobileWeight);
		
	}
	public void sendMSG() {
		boolean isFullyCharged=true;
		int mobileCost=12500;
		System.out.println(isFullyCharged);
		System.out.println(mobileCost);
		
	}
	public static void main(String[] args) {
		Mobile sk=new Mobile();
		sk.makeCall();
        sk.sendMSG();
        System.out.println("This is my mobile");
		
		
	}

}
