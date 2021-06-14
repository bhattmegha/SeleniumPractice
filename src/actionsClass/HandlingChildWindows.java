package actionsClass;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingChildWindows {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\megha\\Downloads\\Browser drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		// using windowhandles for window id's
		Set <String> windows = driver.getWindowHandles();
		//grabbing the window id's from set data structure using Iterators
		Iterator <String> it = windows.iterator(); // setting up the iterator to move in between windows
		String parentId = it.next();  // moving to first window (0th index)
		String childId = it.next(); // moving to second window
		// switching to child window
		
		driver.switchTo().window(childId);
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());  // getting a particular text in console
		//getting email id out of the text
		String emailId = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		// switching back to parent window
		driver.switchTo().window(parentId);
		driver.findElement(By.cssSelector("#username")).sendKeys(emailId);
		
	}

}
