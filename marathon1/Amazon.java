package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("boys bag");
		driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
		WebElement resultBag = driver.findElement(By.xpath("(//div[contains(@class,\"a-spacing-top-small\")])[1]"));
		String resultBag1 = resultBag.getText();
		System.out.println(resultBag1);
		driver.findElement(By.xpath("(//span[text()=\"DZert\"])[7]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()=\"FUR JADEN\"]")).click();
		driver.findElement(By.xpath("//span[text()=\"Featured\"]")).click();
		driver.findElement(By.xpath("//a[text()=\"Newest Arrivals\"]")).click();
		WebElement bagName = driver.findElement(By.xpath("(//span[@class=\"a-size-base-plus a-color-base\"])[1]"));
		String bagName1 = bagName.getText();
		System.out.println(bagName1);
		WebElement disPrice = driver.findElement(By.xpath("(//span[@class=\"a-price-whole\"])[1]"));
		String disPrice1 = disPrice.getText();
		System.out.println("DiscountedPrice"+disPrice1);
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
	}

}
