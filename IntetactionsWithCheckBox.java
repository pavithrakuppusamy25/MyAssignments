package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IntetactionsWithCheckBox {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()=\"Basic\"]")).click();
		driver.findElement(By.xpath("//span[text()=\"Ajax\"]")).click();
		driver.findElement(By.xpath("//label[text()=\"Python\"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class=\"grid formgrid\"])[4]")).click();
		driver.findElement(By.xpath("(//div[@class=\"ui-toggleswitch-slider\"])")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'selectcheckboxmenu')])[1]")).click();		
		driver.findElement(By.xpath("(//div[contains(@class,'chkbox-box ')])[11]")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'chkbox-box ')])[13]")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'chkbox-box ')])[17]")).clear();
		driver.close();
	}

}
