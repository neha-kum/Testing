package com.navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Back {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.navigate().to("https://demo.opencart.com/");
		driver.navigate().to("http://www.bing.com");
		Thread.sleep(3000);

		driver.navigate().back();

	}

}
