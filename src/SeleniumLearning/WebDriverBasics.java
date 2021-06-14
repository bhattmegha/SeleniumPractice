package SeleniumLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		System.out.println("selenium class");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\megha\\Downloads\\Browser drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.ca/");
		System.out.println(driver.getTitle());   // validating the title of the page
		System.out.println(driver.getCurrentUrl());  //validate if we landed on correct url
		//System.out.println(driver.getPageSource());  // printing the page source
		driver.get("https://ca.yahoo.com/?p=us");
		System.out.println(driver.getTitle());
		driver.navigate().back();   // navigating back to previous page
		
		driver.quit();

	}

}
