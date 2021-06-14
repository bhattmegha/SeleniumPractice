package SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriverConcept {

	public static void main(String[] args) throws InterruptedException {
		
		//headless browser testing
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\megha\\Downloads\\Browser drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//using HtmlUnitDriver to perform headless browser testing
		//WebDriver driver = new HtmlUnitDriver();
		driver.get("https://www.udemy.com/");
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		Thread.sleep(200);
		driver.findElement(By.cssSelector("a.udlite-btn.udlite-btn-medium.udlite-btn-secondary.udlite-heading-sm")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("meghabhattdehradun@gmail.com");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Bang@123");
		driver.findElement(By.cssSelector("#submit-id-submit")).click();
		System.out.println(driver.getTitle());

	}

}
