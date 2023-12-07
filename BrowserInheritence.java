package week3.day4;

public class BrowserInheritence {
	String browserName="Chrome";
	String browserVersion="12.35f";
	
	public void openURL() {
		System.out.println("URL is opening");
		
	}
	public void closeBrowser() {
		System.out.println("The browser is closing");
	}
	public void navigateBack() {
		System.out.println("We can navigate to browser");
	}
	public static void main(String[] args) {
		BrowserInheritence obj=new BrowserInheritence();
		obj.navigateBack();
		obj.closeBrowser();
		
		
	}
	

}
