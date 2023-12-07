package week3.day4;

public class Chrome extends BrowserInheritence {
	
	public void openIncognito() {
		System.out.println("We can use incognito from chrome");
	}
    public void clearCache() {
    	System.out.println("We can clear caches from chrome");
    }
    
    public static void main(String[] args) {
    	Chrome obj=new Chrome();
    	obj.closeBrowser();
        obj.openIncognito();
        System.out.println(obj.browserName="safari");
        obj.clearCache();
        
        

        
	}
}
