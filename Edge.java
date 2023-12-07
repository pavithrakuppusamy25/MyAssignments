package week3.day4;

public class Edge extends BrowserInheritence {
	public void takeSnap() {
		System.out.println("Takesnap from edge");
	}
    public void clearCookies() {
    	System.out.println("clear cookies form edge");
    }
    public static void main(String[] args) {
    	Edge obj=new Edge();
    	obj.takeSnap();
        obj.clearCookies();
        obj.openURL();
        obj.closeBrowser();
        obj.navigateBack();
       System.out.println(obj.browserName);
       System.out.println(obj.browserVersion);
    		
	}
}
