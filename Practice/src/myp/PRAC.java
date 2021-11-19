package myp;



//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PRAC {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\M1073042\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.eazydiner.com/");
		/*if(driver.findElement(By.id("webpush-onsite")).isDisplayed()) {
			driver.switchTo().frame(driver.findElement(By.id("webpush-onsite")));
			driver.findElement(By.id("allow")).click();
			driver.switchTo().defaultContent();
		}
		//driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);*/
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@id='srchbar']")).click();
		Thread.sleep(1000);
		// driver.findElement(By.xpath("//input[@id='search_city']")).sendKeys("Mumbai");
		driver.findElement(By.xpath("//a[@data-city='Mumbai']")).click();

		driver.findElement(By.xpath("//input[@id='home-search']")).sendKeys("Pizz hUT");
		Thread.sleep(1000);
		driver.findElement(By.id("apxor_search")).click();




		
		

	}

}
