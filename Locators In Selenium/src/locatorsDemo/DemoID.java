package locatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoID {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hollandandbarrett.com/auth/login");

		driver.findElement(By.id("username")).sendKeys("nehathejunious@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Danaruto#8");
		
		driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
		Thread.sleep(5000);
		
		driver.quit();

	}

}