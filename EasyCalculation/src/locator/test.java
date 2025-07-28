package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test {
	
	WebDriver driver;
	
	
	@Test
	public void DemoTestID() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.easycalculation.com/");
	    
        driver.findElement(By.id("googleSearchId")).click();
        driver.findElement(By.id("googleSearchId")).sendKeys("bangalore");
     
		driver.findElement(By.xpath("//button[@class='search_button']")).click();
		
		driver.quit();
	}
	

}
