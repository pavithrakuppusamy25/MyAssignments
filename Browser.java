package week2.day2;

public class Browser {
	public String launchBrowserName(String browserName) {
		System.out.println("Browser landed Successfully");
		return browserName;
		
		
	}
	
	private void loadURL() {
		System.out.println("Application URL loaded successfully");

	}
	public static void main(String[] args) {
		Browser calling=new Browser();
		calling.launchBrowserName("Firefox");
		calling.loadURL();
		
		
	}
	

}
