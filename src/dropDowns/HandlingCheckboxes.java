package dropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HandlingCheckboxes {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\megha\\Downloads\\Browser drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		//putting assertion to validate if the checkbox is not selected
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected()); // to check if the checkbox is selected or not
		//to find total number of checkboxes in the page
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		driver.quit();

	}

}
