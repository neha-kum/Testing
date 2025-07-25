package locatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SignIn {
	
	WebDriver driver;
	
	
	@Test
	public void DemoTestID() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hollandandbarrett.com/auth/login");

        driver.findElement(By.xpath("//input[@id='googleSearchId']")).click();

		driver.findElement(By.id("googleSearchId")).sendKeys("bangalore");
		driver.findElement(By.name("password")).sendKeys("Danaruto#8");
		
		driver.findElement(By.xpath("//button[@class='search_button']")).click();
		Thread.sleep(5000);
		
		driver.quit();
	}
	

}
