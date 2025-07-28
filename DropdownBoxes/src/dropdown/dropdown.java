package dropdown;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class dropdown {
WebDriver driver;
	
	
	@Test
	public void DemoTestID() throws InterruptedException{
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/campaign/landing.php?%22");
	    
	    driver.manage().window().maximize();
	    
	    WebElement month_Dropdown = driver.findElement(By.id ("month"));
	    Select month_dd = new Select(month_Dropdown) ;
	    month_dd.selectByIndex(9);
	    Thread.sleep (5000);
	    month_dd.selectByValue("9");
	    Thread.sleep (5000);
	    month_dd.selectByVisibleText ("Dec");
	    Thread.sleep (5000);
	    
        List<WebElement> allMonths = month_dd.getOptions();
	    
	    for (WebElement ele : allMonths) {
	    	String month_name = ele.getText();
            System.out.println("Month names are:" + month_name);
        }

	    driver.quit();
	    
	
	}
	

}
