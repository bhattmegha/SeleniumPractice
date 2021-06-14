package SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\megha\\Downloads\\Browser drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=ca");
		driver.findElement(By.cssSelector("#username")).sendKeys("meghabhatt");
		driver.findElement(By.cssSelector("#password")).sendKeys("password");
		driver.findElement(By.cssSelector("#Login")).click();
		System.out.println("error displayed :"+ driver.findElement(By.xpath("//*[@id='error']")).getText());
		driver.quit();
		

	}

}
