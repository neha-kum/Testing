package locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LinkTextAndPartialLink {
WebDriver driver;
	
	
	@Test
	public void DemoTestID(){
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.hollandandbarrett.com");
	    driver.findElement(By.partialLinkText("Vitamins")).click();
	    
	    driver.manage().window().maximize();
	    
	    List<WebElement> links = driver.findElements(By.xpath("//a"));
	    int nolinks = links.size();
	    System.out.println("no. of links in hollandandbarrett application:" + nolinks);
	    
	    for(int i =0; i<links.size(); i++) {
	    	System.out.println(links.get(i).getText());
	    	String str = links.get(i).getText();
	    	
	    	String str1 = "Vitamins";
	    	
	    	if(str == str1) {
	    		driver.findElement(By.linkText("Vitamins")).click();
	    		driver.findElement(By.xpath("(//a[contains(@type,'button')])[4]")).click();
	    	}
	    }
	    

	    driver.quit();

	
	}
	

}
