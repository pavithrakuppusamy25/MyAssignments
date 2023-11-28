package week2.day2;

public class BrowserClassEdge {
	public void edge() {
		System.out.println("Cross broswer Testing");
	}

	public static void main(String[] args) {
		Browser calling=new Browser();
		calling.launchBrowserName(null);
		BrowserClassEdge pk=new BrowserClassEdge();
		pk.edge();


	}
	

}
