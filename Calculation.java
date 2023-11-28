package week2.day2;

public class Calculation {
	public float add(int a,float b) {
		float result;
		result=a+b;
		System.out.println(result);
        return result;
	}
	private void sub() {
		int a=10;
		int b=30;
		int c=a+b;
		System.out.println(c);
	}
	protected void mul(int a, int b) {
		System.out.println(a*b);
		
	}
	void div() {
		int a=20;
		int b=10;
		int sum=a/b;
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		Calculation cal=new Calculation();
		cal.add(10, 50);
		cal.sub();
        cal.mul(10, 10);
        cal.div();
		
		
	}
	

}
