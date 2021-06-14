package SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorServiceNow {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\megha\\Downloads\\Browser drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=ca");
		driver.findElement(By.cssSelector("input#username")).sendKeys("meghabhatt");
		driver.findElement(By.cssSelector("#password")).sendKeys("pass");
		driver.findElement(By.cssSelector("[id='Login']")).click();
		driver.findElement(By.xpath("//a[text()='Forgot Your Password?']")).click();
		driver.findElement(By.cssSelector("#un")).sendKeys("megha");
		driver.findElement(By.cssSelector("#continue")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='verifyform']/div")).getText());  //using parent to child relationship
		driver.navigate().back();
		driver.navigate().back();

	}

}
