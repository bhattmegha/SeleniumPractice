package dropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\megha\\Downloads\\Browser drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//For static drop down we have static class in selenium, creating object for SELECT class
		WebElement staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticdropdown);
		//selecting option by index
		dropdown.selectByIndex(2);
		System.out.println(dropdown.getFirstSelectedOption().getText()) ;
		//selecting option by visible text
		dropdown.selectByVisibleText("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());

	}

}
