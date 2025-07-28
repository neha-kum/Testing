package locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TagNameDemo {
WebDriver driver;
	
	
	@Test
	public void DemoTestID(){
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.hollandandbarrett.com//");
	    driver.manage().window().maximize();
	    
	    List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	    System.out.println(allLinks.size());
	    
	    for(WebElement ele: allLinks) {
	    	System.out.println(ele.isDisplayed());
	    	System.out.println(ele.isEnabled());
	    	System.out.println(ele.getAttribute("href"));

	    }
	    
	    WebElement ele = allLinks.get(5);
	    ele.click();
	    
	    driver.quit();

	
	}
	

}
