package com.chromeBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	    driver.get("https://demo.opencart.com/");
		driver.get("http://www.bing.com");
		driver.get("https://www.freecrm.com/");
		driver.get("http://www.half.ebay.com");
	}

}
