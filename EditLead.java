package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

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
		driver.findElement(By.xpath("//a[text()=\"Create Lead\"]")).click();
		driver.findElement(By.xpath("(//input[@name=\"companyName\"])[2]")).sendKeys("Aspire");
		driver.findElement(By.xpath("(//input[@name=\"firstName\"])[3]")).sendKeys("swani");
		driver.findElement(By.xpath("//input[@id=\"createLeadForm_lastName\"]")).sendKeys("Arumugham");
		driver.findElement(By.xpath("//input[@id=\"createLeadForm_firstNameLocal\"]")).sendKeys("swa");
		driver.findElement(By.xpath("//input[@id=\"createLeadForm_departmentName\"]")).sendKeys("IT sector");
		driver.findElement(By.xpath("//textarea[@id=\"createLeadForm_description\"]")).sendKeys("Nothing to say simple");
		driver.findElement(By.xpath("//input[@id=\"createLeadForm_primaryEmail\"]")).sendKeys("pavithra25@gmail.com");
		WebElement selectState = driver.findElement(By.xpath("//select[@id=\"createLeadForm_generalStateProvinceGeoId\"]"));
		Select selectState1=new Select(selectState);
		selectState1.selectByIndex(4);
		driver.findElement(By.xpath("//input[@class=\"smallSubmit\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()=\"Edit\"]")).click();
		driver.findElement(By.xpath("//textarea[@name=\"description\"]")).clear();
		driver.findElement(By.xpath("//textarea[@name=\"description\"]")).sendKeys("New text were added");
		driver.findElement(By.xpath("//input[@value=\"Update\"]")).click();
		Thread.sleep(1000);
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();
		
		
		
		
		
		
		
			
		

	}

}
