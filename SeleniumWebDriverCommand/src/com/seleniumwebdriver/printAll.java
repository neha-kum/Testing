package com.seleniumwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class printAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		driver.manage().window().maximize();
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		String Title = driver.getTitle();
		System.out.println(Title);
		String source = driver.getPageSource();
		System.out.println(source);
		driver.quit();
	}

}
