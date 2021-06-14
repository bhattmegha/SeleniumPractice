package SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\megha\\Downloads\\Browser drivers\\chromedriver_win32\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("https://login.salesforce.com/?locale=ca");
      driver.findElement(By.id("username")).sendKeys("meghabhatt");
      driver.findElement(By.name("pw")).sendKeys("12345");
      driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();  // java automatically converted //*[@id="Login"] == to == //*[@id=\"Login\"] as double quotes inside double quotes is not accepted in java

	}

}
