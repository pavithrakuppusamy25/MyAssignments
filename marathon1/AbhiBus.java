package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AbhiBus {



	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.abhibus.com/");
        driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("Chennai");
        driver.findElement(By.xpath("//div[text()=\"Chennai\"]")).click();
        driver.findElement(By.xpath("//input[@placeholder=\"To Station\"]")).sendKeys("Bangalore");
        driver.findElement(By.xpath("//div[text()=\"Bangalore\"]")).click();
        driver.findElement(By.xpath("//a[text()=\"Tomorrow\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()=\"Search\"]")).click();
        driver.findElement(By.xpath("(//a[contains(@class,\"sm active button\")])[1]")).click();
        WebElement firstBus = driver.findElement(By.xpath("(//h5[@class=\"title\"])[1]"));
        String firstBus1 = firstBus.getText();
        System.out.println(firstBus1);
        WebElement seatsAvilble = driver.findElement(By.xpath("(//button[text()=\"Show Seats\"]//following::small)[1]"));
        String seatsAvilble1= seatsAvilble.getText();
        System.out.println(seatsAvilble1);
        driver.findElement(By.xpath("(//button[text()=\"Show Seats\"])[1]")).click();
        driver.findElement(By.xpath("//span[text()=\"U1\"]")).click();
        driver.findElement(By.xpath("//p[text()=\"Siruseri\"]")).click();
        driver.findElement(By.xpath("//p[text()=\"Attipalli Toll\"]")).click();
        driver.findElement(By.xpath("//span[text()=\"Continue\"]")).click();
        WebElement seatNum = driver.findElement(By.xpath("//span[@class=\"text-success\"]"));
        String seatNum1 = seatNum.getText();
        System.out.println(seatNum1);
        WebElement totalFare = driver.findElement(By.xpath("//small[text()=\"Total Fare (inclusive)\"]"));
        String  totalFare1= totalFare.getText();
        System.out.println(totalFare1);
        driver.findElement(By.xpath("(//h5[@class=\"title\"])[1]"));
        String title = driver.getTitle();
        System.out.println(title);
        
	}
	

}
