package radiobutton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EaseMyTrip {
	
	WebDriver driver;
	
	
	@Test
	public void DemoTestID() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.easemytrip.com/");
	    
        int radioBtnCount = driver.findElements(By.xpath("//input[@type='checkbox']")).size();
        
        System.out.println("Number Of Radio Buttons: " + radioBtnCount);
		driver.quit();
	}
	

}
