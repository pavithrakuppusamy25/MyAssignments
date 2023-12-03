package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtoLearning {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		WebElement favUnclick = driver.findElement(By.xpath("(//label[text()=\"Firefox\"])[1]"));
		favUnclick.click(); 
		if(favUnclick.isSelected()) {
			favUnclick.click();
			
		}
		else {
			System.out.println("notchecked");
		}
		WebElement defaultBro = driver.findElement(By.xpath("(//label[text()=\"Safari\"])[2]"));
		if(defaultBro.isEnabled()) {
			System.out.println("default value selected");
		}
		else {
			System.out.println("notselected");
		}
		WebElement ageGroup = driver.findElement(By.xpath("//label[text()=\"21-40 Years\"]"));
		if(ageGroup.isEnabled()) {
			System.out.println("check box enabled");
		}
		else {
			ageGroup.click();
		}
		

		
		
	}

}
