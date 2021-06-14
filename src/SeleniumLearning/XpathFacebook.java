package SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathFacebook {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\megha\\Downloads\\Browser drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		// by creating our own xpath
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("megha");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("bhatt");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\'loginform\']/div[2]/div[2]")).getText());

	}

}
