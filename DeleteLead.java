package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//input[@class=\"inputLogin\"])[1]")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class=\"decorativeSubmit\"]")).click();
		driver.findElement(By.xpath("//a[contains(text(),\"CRM\")]")).click();
		driver.findElement(By.xpath("//a[text()=\"Leads\"]")).click();
		driver.findElement(By.xpath("//a[text()=\"Find Leads\"]")).click();
		driver.findElement(By.xpath("//span[text()=\"Name and ID\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"id\"]")).sendKeys("10022");
		driver.findElement(By.xpath("//button[text()=\"Find Leads\"]")).click();
		WebElement leadID = driver.findElement(By.xpath("//a[text()=\"10022\"]"));
		String text1 = leadID.getText();
		System.out.println(text1);
		Thread.sleep(6000);
		driver.findElement(By.xpath("//a[text()=\"Rajeswari \"]")).click();
		driver.findElement(By.xpath("//a[text()=\"Delete\"]")).click();
		driver.findElement(By.xpath("//a[text()=\"Find Leads\"]")).click();
		driver.findElement(By.xpath("//span[text()=\"Name and ID\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"id\"]")).sendKeys("10022");
		driver.findElement(By.xpath("//button[text()=\"Find Leads\"]")).click();
		WebElement noRecord = driver.findElement(By.xpath("//div[text()=\"No records to display\"]"));
		String text = noRecord.getText();
		System.out.println(text);
		
		
		
		
		
		
	    
		
		
		
		
		
		
		
	}

}
