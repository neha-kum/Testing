package com.navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Refresh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
     
        driver.navigate().to("https://www.freecrm.com/");
  
		driver.quit();
	}

}