package wee4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        List<WebElement> tags = driver.findElements(By.tagName("a"));
        System.out.println(tags.size());
        //Enter the phone
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phone",Keys.ENTER);
        List<WebElement> price = driver.findElements(By.xpath("//span[@class=\"a-price-whole\"]"));
        //to create new list to store integer data
        List<Integer> newList=new ArrayList<Integer>();
        for (int i = 0; i <price.size(); i++) {
        	String phonePrice = price.get(i).getText();
        	//Replcae spl character
        	String replaceAll = phonePrice.replaceAll(",", "");
        	//convert them into integer
        	int priceInt=Integer.parseInt(replaceAll);
        	newList.add(priceInt);
        	
			
		}
       Collections.sort(newList);
       System.out.println(newList);
       System.out.println("LowestPrice"+newList.get(0));
       
			
		}
        
		
	}


