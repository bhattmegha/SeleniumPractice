package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FirstProgram {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\megha\\Downloads\\Browser drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		WebElement move = driver.findElement(By.cssSelector("#nav-link-accountList"));
		//creating action class
		Actions a = new Actions(driver);
		a.moveToElement(move).build().perform(); //moving to an element, mouse hovering
		
		//2. sending text in capital letter
		
		//a.moveToElement(driver.findElement(By.cssSelector("#twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("vaccum cleaner").build().perform();
		
		//3. selecting the text entered in the text box by double clicking
		
		a.moveToElement(driver.findElement(By.cssSelector("#twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("vaccum cleaner").doubleClick().build().perform();
		
		// right click on the element
		
		a.moveToElement(move).contextClick().build().perform();

	}

}
