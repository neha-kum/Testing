package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Rediff {
	
	@Test
	public void TestPopups() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	    
	  
	    driver.findElement(By.name("proceed")).click();
        Thread.sleep(3000);
        Alert alert = driver.switchTo().alert();
        Thread.sleep(3000);
        System.out.println(alert.getText());
        String text = alert.getText();
        
        if (text.equals("Please enter a valid user name")) {
            System.out.println("Correct alert message");
        } else {
            System.out.println("Incorrect alert message");
        }

        alert.accept();

        driver.quit();
        
        
		
        	    
	}
	

}
