package com.navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
        driver.navigate().to("https://demo.opencart.com/");
        driver.navigate().to("http://www.bing.com");

        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        
        driver.navigate().to("https://www.freecrm.com/");
        driver.navigate().to("http://www.half.ebay.com");
        
        String URL = driver.getCurrentUrl();
		System.out.println(URL);
		
		
		String Title = driver.getTitle();
		System.out.println(Title);
		
//		String source = driver.getPageSource();
//		System.out.println(source);
        
//        getTitle(), 
//        getPageSource(), getCurrentUrl(),quit()



		//drive.close();
		driver.quit();
	}

}