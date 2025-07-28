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
	    driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	    driver.manage().window().maximize();

	    
	  
	    driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		alert.accept();
		String result = driver.findElement(By.cssSelector("#result")).getText();
		System.out.println(result);
		Assert.assertEquals("You successfully clicked an alert", result);
        
		
        driver.findElement(By.xpath("//button[contains(text(), 'Click for JS Confirm')]")).click();
        Alert alert2 = driver.switchTo().alert();
        Thread.sleep(3000); 
        alert2.dismiss();   
        String result2 = driver.findElement(By.cssSelector("#result")).getText();
        System.out.println(result2);
        Assert.assertEquals(result2, "You clicked: Cancel");

        
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
        Alert alert3 = driver.switchTo().alert();
        Thread.sleep(3000);
        alert3.accept(); 
        String result3 = driver.findElement(By.cssSelector("#result")).getText();
        System.out.println(result3);
        Assert.assertEquals(result3, "You clicked: Ok");
        	    
	}
	

}
