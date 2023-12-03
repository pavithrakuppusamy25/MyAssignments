package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundButtonInteraction {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id=\"j_idt88:j_idt90\"]")).click();
		//Verification page of name is Dashboard
		String title = driver.getTitle();
		System.out.println(title);
		driver.navigate().back();
		//button color
		driver.findElement(By.xpath("//span[text()=\"Submit\"]")).click();
		String buttonColor = driver.findElement(By.xpath("//span[text()=\"Submit\"]")).getCssValue("background-color");
		System.out.println("Button color: " + buttonColor);
		Dimension findElement = (Dimension) driver.findElement(By.xpath("//span[contains(text(),'Submit')]")).getSize();
		System.out.println(findElement);
		driver.close();
		
		
		
		
		
		
		
	}

}
