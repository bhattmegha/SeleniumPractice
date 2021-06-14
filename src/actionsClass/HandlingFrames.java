package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\megha\\Downloads\\Browser drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/#top");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//ul[@class='navigation clearfix']/li[3]")).click();
		//Thread.sleep(2000);
		driver.findElement(By.cssSelector("#name")).sendKeys("Meghabhatt");
		driver.findElement(By.cssSelector("#email")).sendKeys("meghabhatt@gmail.com");
		driver.findElement(By.xpath("input[@type='checkbox']")).click();
		driver.findElement(By.xpath("button[@type='submit']")).click(); 
		
		
		
		
	}

}
