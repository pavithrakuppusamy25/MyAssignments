package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PVRCinemas {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.pvrcinemas.com/");
        driver.findElement(By.xpath("//input[@name=\"search-cities\"]")).sendKeys("Chennai");
        driver.findElement(By.xpath("//img[@alt=\"Chennai\"]")).click();
         Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class=\"nav-icon\"]")).click();
        driver.findElement(By.xpath("//a[text()=\"Movie Library\"]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//select[@name=\"genre\"]")).click();
        driver.findElement(By.xpath("//option[text()=\"ANIMATION\"]")).click();
        driver.findElement(By.xpath("//select[@name=\"lang\"]")).click();
        driver.findElement(By.xpath("//option[text()=\"ENGLISH\"]")).click();
        driver.findElement(By.xpath("//button[text()=\"Apply\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[text()=\"Paw Patrol\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[text()=\"Proceed To Book\"]")).click();
        driver.findElement(By.xpath("//select[@id=\"cinemaName\"]")).click();
        driver.findElement(By.xpath("//option[text()=\"PVR Heritage RSL ECR Chennai\"]")).click();
        driver.findElement(By.xpath("//ngx-datepicker[@placeholder=\"select date\"]")).click();
        driver.findElement(By.xpath("(//span[@class=\"day-unit ng-star-inserted\"])[1]")).click();
        driver.findElement(By.xpath("//select[@name=\"timings\"]")).click();
        driver.findElement(By.xpath("//option[text()=\"09:00 AM - 12:00 PM\"]")).click();
        driver.findElement(By.xpath("//input[@name=\"noOfTickets\"]")).sendKeys("3");
        driver.findElement(By.xpath("//input[@name=\"name\"]")).sendKeys("pavi");
        driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("qapavithra4@gmail.com");
        driver.findElement(By.xpath("//input[@name=\"mobile\"]")).sendKeys("7339089138");
        driver.findElement(By.xpath("//select[@name=\"food\"]")).click();
        driver.findElement(By.xpath("//option[text()=\"No\"]")).click();
        driver.findElement(By.xpath("//input[@name=\"comment\"]")).sendKeys("verify My code");
        driver.findElement(By.xpath("//label[@class=\"custom-control custom-radio\"]")).click();
        driver.findElement(By.xpath("//button[text()=\"SEND REQUEST\"]")).click();
        driver.findElement(By.xpath("(//button[text()=\"CANCEL\"])[2]")).click();
        driver.findElement(By.xpath("(//button[@class=\"swal2-close\"])")).click();
        String title = driver.getTitle();
        System.out.println(title);
        
        
	}

}
