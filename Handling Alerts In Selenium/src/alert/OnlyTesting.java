package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OnlyTesting {
	
	@Test
	public void TestPopups() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
	    driver.get("http://only-testing-blog.blogspot.com/2014/05/form.html");
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.name("FirstName")).sendKeys("Neha");
		driver.findElement(By.name("LastName")).sendKeys("Kumari");
		driver.findElement(By.name("EmailID")).sendKeys("nehak78800@gmail.com");
		driver.findElement(By.name("MobNo")).sendKeys("7880049324");
		driver.findElement(By.name("Company")).sendKeys("Oracle");

	    
	  
		driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		driver.quit();
        	    
	}
	

}
